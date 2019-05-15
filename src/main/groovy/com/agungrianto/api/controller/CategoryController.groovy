package com.agungrianto.api.controller

import com.agungrianto.api.entity.Category
import com.agungrianto.api.service.CategoryService
import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping('/categories')
class CategoryController{
    @Autowired
    private final CategoryService CategoryService
    
    @GetMapping('')
    List<Category> findAll(){
        CategoryService.findAll()
    }
}