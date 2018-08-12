package cn.edu.jxnu.base.entity;

import java.util.Arrays;

import cn.edu.jxnu.base.entity.BaseEntity;

/**
 * 借阅列表
 * 
 * @author 梦境迷离
 * @time. 2018年4月10日 下午5:39:42.
 * @version V1.0
 */
public class BorrowList extends BaseEntity {

	private static final long serialVersionUID = -1894163644285296223L;

	/**
	 * 用户id
	 */
	private Integer id;
	/**
	 * 待借阅清单
	 */
	private String[] booklist;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String[] getBooklist() {
		return booklist;
	}

	public void setBooklist(String[] booklist) {
		this.booklist = booklist;
	}

	@Override
	public String toString() {
		return "BorrowList [id=" + id + ", booklist=" + Arrays.toString(booklist) + "]";
	}

}
