package com.medsoft.contentmanagementsystem.dao;

import com.medsoft.contentmanagementsystem.entities.Author;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class AuthorDaoImpl implements AuthorRepository <Author>{
    @PersistenceContext
    private  EntityManager em ;
    @Override
    public Author save(Author author) {
        em.persist(author);
        return author;
    }

    @Override
    public List<Author> findAll() {
        Query req  =  em.createQuery("select a from Author  a ") ;
        return req.getResultList();
    }

    @Override
    public List<Author> findAuthorByName() {
        return null;
    }
}
