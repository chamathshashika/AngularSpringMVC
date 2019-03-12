package com.chamath.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chamath.spring.dao.BookDAO;
import com.chamath.spring.modal.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDAO bookDao;

	@Override
	@Transactional
	public long save(Book book) {
		
		return bookDao.save(book);
	}

	@Override
	@Transactional
	public Book get(long id) {
		return bookDao.get(id);
	}

	@Override
	@Transactional
	public List<Book> list() {
		return bookDao.list();
	}

	@Override
	@Transactional
	public void update(long id, Book book) {
		bookDao.update(id, book);

	}

	@Override
	@Transactional
	public void delete(long id) {
		bookDao.delete(id);
	}
}
