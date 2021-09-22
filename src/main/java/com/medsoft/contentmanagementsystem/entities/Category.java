package com.medsoft.contentmanagementsystem.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
public class Category {
    @Id @GeneratedValue
    private  Long id  ;
    private String name  ;
    @OneToMany (cascade = {CascadeType.ALL})
    private Collection<Post> posts  ;

    public  Category (){} ;

    public Category(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Post> getPosts() {
        return posts;
    }

    public void setPosts(Collection<Post> posts) {
        this.posts = posts;
    }
}
