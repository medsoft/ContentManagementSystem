package com.medsoft.contentmanagementsystem.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
public class Author  implements Serializable {
    @Id @GeneratedValue
    private Long id  ;
    private String name  ;
    private String email ;
    @OneToMany (cascade = {CascadeType.ALL})
    private Collection <Post> posts  ;
    public Author()
    {
        super();
    }
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collection<Post> getPosts() {
        return posts;
    }

    public void setPosts(Collection<Post> posts) {
        this.posts = posts;
    }
}
