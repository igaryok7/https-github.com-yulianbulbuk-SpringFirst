package ua.lviv.lgs.entity;

import javax.persistence.*;

/**
 * Created by Yulian Bulbuk on 22.06.2016.
 */
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private int pages;
    @ManyToOne(fetch = FetchType.LAZY)
    private Author author;

    public Book() {
    }

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
