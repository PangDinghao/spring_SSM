package com.pdh.service.impl;

import com.pdh.dao.BookDao;
import com.pdh.dao.impl.BookDaoImpl;
import com.pdh.service.BookService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("bookService")
public class BookServiceImpl implements BookService {

    BookDao bookDao = new BookDaoImpl();
    @Override
    public void save() {
        System.out.println("book service save...");
//        bookDao.save();

    }
}
