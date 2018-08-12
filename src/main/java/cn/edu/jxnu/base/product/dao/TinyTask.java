package cn.edu.jxnu.base.product.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.edu.jxnu.base.dao.IBaseDao;
import cn.edu.jxnu.base.entity.Book;

/**
 * 图书管理dao
 * 
 * @author 梦境迷离 @time. 2018年4月10日 下午5:33:58.
 * @version V1.0
 */
@Repository
public interface TinyTask extends IBaseDao<Book, String> {

	/**
	 * 查询所有二级子文件
	 * 
	 * @author 小橙子 @time. 2018年4月10日 下午5:34:07.</br>
	 * @version V1.0</br>
	 * @param bookId
	 * @return 图书</br>
	 */
	List<TinyTask> selectTinyTaskAll();

	/**
	 * 更新一级数据
	 */
	void updateUser(TinyTask tinyTaskt);

	/**
	 * 插入
	 * 
	 * @author 小橙子 @time. 上午12:01:55
	 * @version V1.0
	 * @param notiFication
	 *
	 */

	void insertUser(TinyTask tinyTaskt);

	/**
	 * 查询指定ID的数据
	 * 
	 * @author 小橙子 @time. 上午12:03:23
	 * @version V1.0
	 * @param id
	 * @return
	 *
	 */
	Task selectTinyTaskById(Integer id);

	/**
	 * 删除指定ID的数据
	 * 
	 * @author 小橙子 @time. 上午12:04:18
	 * @version V1.0
	 * @param id
	 *
	 */
	void deleteTinyTaskById(Integer id);

	
}
