package ua.lviv.lgs.services;

import ua.lviv.lgs.entity.Author;

import java.util.List;

/**
 * Created by Yulian Bulbuk on 22.06.2016.
 */
public interface AuthorService {

    void add(String name, String country);

    List<Author> findAll();
}
