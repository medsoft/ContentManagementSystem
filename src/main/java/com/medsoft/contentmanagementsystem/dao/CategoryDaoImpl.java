package com.medsoft.contentmanagementsystem.dao;

import com.medsoft.contentmanagementsystem.entities.Category;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CategoryDaoImpl implements  CategoryRepository <Category>{
    @PersistenceContext
    private EntityManager em ;

    @Override
    public Category save(Category category) {
        em.persist(category);
        return category;
    }

    @Override
    public List<Category> findAll() {
        Query req =  em.createQuery("select c from Category c ") ;
        return req.getResultList();
    }
}
