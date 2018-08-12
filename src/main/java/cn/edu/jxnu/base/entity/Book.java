package cn.edu.jxnu.base.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.edu.jxnu.base.entity.BaseEntity;

/**
 * 图书表
 * 
 * @author 梦境迷离
 * @time. 2018年4月10日 下午5:39:18.
 * @version V1.0
 */
@Entity
@Table(name = "tb_books")
public class Book extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3275387890061613371L;

	/**
	 * 图书id
	 */
	@Id
	@Column(name = "book_id", nullable = false)
	private String bookId;

	/**
	 * 文件名
	 */
	private String bookName;

	/**
	 * 文件地名
	 */
	private String bookAuthor;

	/**
	 * 经纬度
	 */
	private String bookPress;
	/**
	 * 成像时间
	 */
	private String imgTime;
	private String ceBai;
	private String taiYang;
	
	private String qual;
	private String trait;
	private String record;
	private String other;
	/**
	 * 图书总库存
	 */
	private Integer bookInventory;

	/**
	 * 图书现有库存
	 */
	private Integer currentInventory;

	
	public String getCeBai() {
		return ceBai;
	}

	public void setCeBai(String ceBai) {
		this.ceBai = ceBai;
	}

	public String getTaiYang() {
		return taiYang;
	}

	public void setTaiYang(String taiYang) {
		this.taiYang = taiYang;
	}

	public String getImgTime() {
		return imgTime;
	}

	public void setImgTime(String imgTime) {
		this.imgTime = imgTime;
	}

	public String getQual() {
		return qual;
	}

	public void setQual(String qual) {
		this.qual = qual;
	}

	public String getTrait() {
		return trait;
	}

	public void setTrait(String trait) {
		this.trait = trait;
	}

	public String getRecord() {
		return record;
	}

	public void setRecord(String record) {
		this.record = record;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public Integer getCurrentInventory() {
		return currentInventory;
	}

	public void setCurrentInventory(Integer currentInventory) {
		this.currentInventory = currentInventory;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public void setBookInventory(Integer bookInventory) {
		this.bookInventory = bookInventory;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookPress() {
		return bookPress;
	}

	public void setBookPress(String bookPress) {
		this.bookPress = bookPress;
	}

	public Integer getBookInventory() {
		return bookInventory;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPress="
				+ bookPress + ", imgTime=" + imgTime + ", ceBai=" + ceBai + ", taiYang=" + taiYang + ", qual=" + qual
				+ ", trait=" + trait + ", record=" + record + ", other=" + other + ", bookInventory=" + bookInventory
				+ ", currentInventory=" + currentInventory + "]";
	}

	/*@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPress="
				+ bookPress + ", bookInventory=" + bookInventory + ", currentInventory=" + currentInventory + "]";
	}*/

}
