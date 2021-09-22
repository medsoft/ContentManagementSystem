package com.medsoft.contentmanagementsystem.dao;

import com.medsoft.contentmanagementsystem.entities.Category;

import java.util.List;

public interface CategoryRepository  <C>{

    public C save (C c ) ;
    public List <Category> findAll();
}
