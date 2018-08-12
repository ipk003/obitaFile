package cn.edu.jxnu.base.scheduler;

import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import cn.edu.jxnu.base.config.shiro.RetryLimitHashedCredentialsMatcher;

/**
 * 定时任务
 * 
 * @author 梦境迷离 @time. 下午2:05:52
 * @version V1.0
 *
 */
@Component
public class Scheduler {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private RetryLimitHashedCredentialsMatcher credentialsMatcher;
	public static volatile ConcurrentLinkedDeque<String> list = new ConcurrentLinkedDeque<String>();
	public static ReentrantLock lock = new ReentrantLock();

	/**
	 * ehcache的缓存过期无效，使用定时任务替代。
	 * 
	 * @author 梦境迷离 
	 * @time. 下午2:05:52
	 * @version V1.0
	 *
	 */
	@Scheduled(fixedRate = 3600000) // 每10分钟执行一次
	public void statusCheck() {
		try {

			lock.tryLock(60, TimeUnit.SECONDS);
			logger.info("每1小时执行一次。开始……");
			// 添加到阻塞双端队列
			String string = null;
			string = list.pollFirst();
			if (string != null) {
				if (credentialsMatcher.getPasswordRetryCache().get(string) != null) {
					logger.info("正在取出阻塞队列和缓存中的用户名");
					credentialsMatcher.getPasswordRetryCache().remove(string);
				}
			}
		} catch (Exception e) {
			lock.unlock();
		}
		logger.info("每1小时执行一次。结束……");
	}

	/**
	 * 防止内存溢出
	 * 
	 * @author 梦境迷离 
	 * @time. 下午1:50:22
	 * @version V1.0
	 *
	 */
	@Scheduled(fixedRate = 7200000) // 每60分钟执行一次,清空
	public void checkSize() {
		logger.info("每2小时执行一次。开始……");
		int size = list.size();
		if (size > 1000) {
			list.clear();
		}
		logger.info("每2小时执行一次。结束……");
	}
}