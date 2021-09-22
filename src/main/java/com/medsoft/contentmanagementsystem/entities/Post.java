package com.medsoft.contentmanagementsystem.entities;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
public class Post  implements Serializable {
    @Id @GeneratedValue
    private Long id  ;
    private String title ;
    private String description  ;
    private Date dateCreation  ;
    @ManyToOne @JoinColumn(name = "idCategory")
    private Category category ;
    @ManyToOne @JoinColumn(name = "idAuthor" )
    private Author author ;
    public Post (){}

    public Post(String title, String description , Date dateCreation, Category category , Author author) {
        this.title = title;
        this.description = description;
        this.dateCreation = dateCreation;
        this.category = category;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
