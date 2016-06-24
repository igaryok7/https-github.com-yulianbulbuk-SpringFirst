package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.BookDao;
import ua.lviv.lgs.entity.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Yulian Bulbuk on 22.06.2016.
 */
@Repository
public class BookDaoImpl implements BookDao {

    @PersistenceContext(unitName = "qwerty")
    private EntityManager entityManager;

    @Transactional
    public void add(Book book) {
        entityManager.persist(book);
    }
}
