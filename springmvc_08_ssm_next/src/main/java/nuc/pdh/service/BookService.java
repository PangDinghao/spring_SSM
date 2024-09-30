package nuc.pdh.service;

import nuc.pdh.pojo.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface BookService {

    public boolean save(Book book);
    public boolean update(Book book);

    public boolean delete(Integer id);

    public Book getById(Integer id);

    public List<Book> getAll();
}
