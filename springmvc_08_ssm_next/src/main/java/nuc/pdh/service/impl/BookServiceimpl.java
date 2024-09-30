package nuc.pdh.service.impl;

import nuc.pdh.dao.BookDao;
import nuc.pdh.pojo.Book;
import nuc.pdh.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceimpl implements BookService {

    @Autowired
    private BookDao bookDao;
    @Override
    public boolean save(Book book) {
        bookDao.save(book);
        return false;
    }

    @Override
    public boolean update(Book book) {
        bookDao.update(book);
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        bookDao.delete(id);
        return false;
    }

    @Override
    public Book getById(Integer id) {
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
