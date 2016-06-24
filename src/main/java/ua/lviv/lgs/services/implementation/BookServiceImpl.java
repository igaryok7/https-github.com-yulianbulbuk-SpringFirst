package ua.lviv.lgs.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.BookDao;
import ua.lviv.lgs.entity.Book;
import ua.lviv.lgs.services.BookService;

/**
 * Created by Yulian Bulbuk on 22.06.2016.
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Transactional
    public void add(String name, int pages) {
        Book book = new Book(name,pages);
        bookDao.add(book);
    }
}
