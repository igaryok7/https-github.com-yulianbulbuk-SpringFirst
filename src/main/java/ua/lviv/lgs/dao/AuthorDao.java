package ua.lviv.lgs.dao;

import ua.lviv.lgs.entity.Author;

import java.util.List;

/**
 * Created by Yulian Bulbuk on 22.06.2016.
 */
public interface AuthorDao {

    void add(Author author);

    List<Author> findAllAuthors();
}
