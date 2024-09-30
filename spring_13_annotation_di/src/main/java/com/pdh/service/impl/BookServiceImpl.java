package com.pdh.service.impl;

import com.pdh.dao.BookDao;
import com.pdh.dao.impl.BookDaoImpl;
import com.pdh.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    @Qualifier("bookDao2")
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("Book Service sava...");
        bookDao.save();
    }
}
