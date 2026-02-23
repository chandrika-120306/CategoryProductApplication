package com.application.CategoryProduct.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.application.CategoryProduct.entity.Category;
import com.application.CategoryProduct.service.CategoryService;
@RestController
@RequestMapping("/api/categories")
public class CategoryController {
 @Autowired
 public CategoryService categoryService;

 @PostMapping
public Category createCategory(@RequestBody Category category){
    return categoryService.addCategory(category);
}
@GetMapping("/count")
public long getcategorycount(){
    return categoryService.getCategoriesCount();
}
}
