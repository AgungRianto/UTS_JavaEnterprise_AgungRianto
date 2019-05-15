package com.agungrianto.api.service

import com.agungrianto.api.entity.Category

interface CategoryService{
    List<Category> findAll()

    Category findById(int id)
}