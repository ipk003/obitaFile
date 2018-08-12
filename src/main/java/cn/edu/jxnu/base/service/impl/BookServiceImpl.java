package cn.edu.jxnu.base.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.jxnu.base.common.UUIDUtils;
import cn.edu.jxnu.base.dao.IBaseDao;
import cn.edu.jxnu.base.dao.IBookDao;
import cn.edu.jxnu.base.entity.Book;
import cn.edu.jxnu.base.service.IBookService;

/**
 * 图书服务层实现
 * 
 * @author 梦境迷离
 * @time. 2018年4月10日 下午5:54:20.
 * @version V1.0
 */
@Service
public class BookServiceImpl extends BaseServiceImpl<Book, String>implements IBookService {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private IBookDao bookDao;

	@Override
	public IBaseDao<Book, String> getBaseDao() {
		return this.bookDao;
	}

	@Override
	public Book findByBookId(String id) {
		logger.info("findById:" + id);
		return bookDao.findByBookId(id);
	}

	@Override
	public Book findByBookName(String bookName) {
		logger.info("findByName:" + bookName);
		return bookDao.findByBookName(bookName);
	}

	@Override
	public Book findByBookPress(String qual) {
		logger.info("findByPress:" + qual);
		return bookDao.findByBookPress(qual);
	}

	@Override
	public void saveOrUpdate(Book book) {
		logger.info("saveOrUpdate:" + book.toString());
		if (book.getBookId() == null || book.getBookId().length() == 0) {
			book.setBookId(UUIDUtils.makeID());
			book.setCurrentInventory(book.getBookInventory());
			save(book);
		} else {
			Book mBook = findByBookId(book.getBookId());
			mBook.setBookName(book.getBookName());
			mBook.setBookAuthor(book.getBookAuthor());
			mBook.setBookPress(book.getBookPress());
			
			mBook.setImgTime(book.getImgTime());
			mBook.setCeBai(book.getCeBai());
			mBook.setTaiYang(book.getTaiYang());
			mBook.setQual(book.getQual());
			mBook.setTrait(book.getTrait());
			mBook.setRecord(book.getRecord());
			mBook.setOther(book.getOther());
			
			
			
			
			
			
			mBook.setBookInventory(book.getBookInventory());
			mBook.setCurrentInventory(book.getCurrentInventory());
			update(mBook);
		}

	}

}
