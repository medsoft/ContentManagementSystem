package com.medsoft.contentmanagementsystem.dao;

import com.medsoft.contentmanagementsystem.entities.Author;

import java.util.List;

public interface AuthorRepository <A>{
    public A save (A a ) ;
    public List<Author> findAll() ;
    public List<Author> findAuthorByName() ;
}
