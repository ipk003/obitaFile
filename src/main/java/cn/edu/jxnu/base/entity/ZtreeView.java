package cn.edu.jxnu.base.entity;

import java.io.Serializable;

/**
 * ztree树
 * 
 * @author 梦境迷离
 * @time. 2018年4月10日 下午5:42:40.
 * @version V1.0
 */
public class ZtreeView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6237809780035784312L;

	/**
	 * id
	 */
	private Long id;
	/**
	 * 父id
	 */
	private Long pId;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 是否展开
	 */
	private boolean open;
	/**
	 * 是否已点击，默认false
	 */
	private boolean checked = false;

	/**
	 * 默认构造
	 * 
	 * @time. 2018年4月10日 下午5:44:18.</br>
	 * @version V1.0</br>
	 *          </br>
	 */
	public ZtreeView() {
	}

	public ZtreeView(Long id, Long pId, String name, boolean open) {
		super();
		this.id = id;
		this.pId = pId;
		this.name = name;
		this.open = open;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getpId() {
		return pId;
	}

	public void setpId(Long pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

}
