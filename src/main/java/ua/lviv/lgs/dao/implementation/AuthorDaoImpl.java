package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.AuthorDao;
import ua.lviv.lgs.entity.Author;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Yulian Bulbuk on 22.06.2016.
 */
@Repository
public class AuthorDaoImpl implements AuthorDao {

    @PersistenceContext(unitName = "qwerty")
    private EntityManager entityManager;


    @Transactional
    public void add(Author author) {
        entityManager.persist(author);
    }

    @Transactional
    public List<Author> findAllAuthors() {
        return entityManager.createQuery("from Author ").getResultList();
    }

    @Transactional
    public void delete(Author author){
        entityManager.remove(author);
    }
}
