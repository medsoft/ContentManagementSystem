package com.medsoft.contentmanagementsystem.dao;

import java.util.List;

public interface PostRepository <P> {
    public P save (P p) ;
    public List <P> findAll () ;
    public List <P> findByTitle(String mc);
    public P findOne (Long id )   ;
    public P update (P post) ;
    public void delete (Long id) ;



}
