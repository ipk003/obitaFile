package cn.edu.jxnu.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 
 * 主启动类
 * 
 * @author 梦境迷离
 * @version V1.0 
 * @time. 2018年3月19日10:46:46.
 */
@SpringBootApplication
@EnableCaching
@EnableScheduling
public class Application {

	private static Logger logger = LoggerFactory.getLogger(Application.class);

	/**
	 * 主方法
	 * 
	 * @author 梦境迷离 
	 * @time. 2018年4月10日.
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		logger.debug("启动成功");
	}

}
