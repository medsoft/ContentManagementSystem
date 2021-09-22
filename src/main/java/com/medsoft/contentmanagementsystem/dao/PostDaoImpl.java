package com.medsoft.contentmanagementsystem.dao;

import com.medsoft.contentmanagementsystem.entities.Post;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class PostDaoImpl implements   PostRepository <Post>{
    @PersistenceContext
    private  EntityManager em  ;
    @Override
    public Post save(Post p) {
        em.persist(p);
        return p ;
    }

    @Override
    public List<Post> findAll() {
        Query req = em.createQuery("Select p from Post p  ");
        return req.getResultList();
    }

    @Override
    public List<Post> findByTitle(String mc) {
        return null;
    }

    @Override
    public Post findOne(Long id) {
        return null;
    }

    @Override
    public Post update(Post p) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }
}
