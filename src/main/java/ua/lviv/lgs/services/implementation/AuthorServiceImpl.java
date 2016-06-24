package ua.lviv.lgs.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.AuthorDao;
import ua.lviv.lgs.entity.Author;
import ua.lviv.lgs.entity.Book;
import ua.lviv.lgs.services.AuthorService;

import java.util.List;

/**
 * Created by Yulian Bulbuk on 22.06.2016.
 */
@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorDao authorDao;

    @Transactional
    public void add(String name, String country) {
        Author author = new Author(name, country);
        authorDao.add(author);
    }

    @Transactional
    public List<Author> findAll() {
        return authorDao.findAllAuthors();
    }
}
