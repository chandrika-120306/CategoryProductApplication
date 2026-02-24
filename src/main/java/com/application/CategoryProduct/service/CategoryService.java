package com.application.CategoryProduct.service;
import com.application.CategoryProduct.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.application.CategoryProduct.entity.Category;
import java.util.*;
@Service
public class CategoryService {
    @Autowired
private CategoryRepository categoryRepository;
 
public Category addCategory(Category category){
return categoryRepository.save(category);
}

public Category getCategoryById(Long id){
Category categoryId=categoryRepository.findById(id).orElseThrow(()-> new RuntimeException("category not found") );
return categoryId;
}
public Long getCategoriesCount(){
List<Category> categories=categoryRepository.findAll();
return (long)categories.size();
}
public void deleteCategory(Long id) {
    categoryRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Category not found with id: " + id));
    categoryRepository.deleteById(id);
}
public Category updateById(Long id,Category category){
    Category existingCategory=categoryRepository.findById(id)
    .orElseThrow(()->new RuntimeException("category with "+id+"id not present"));
existingCategory.setName(category.getName());
existingCategory.setDescription(category.getDescription());
return categoryRepository.save(existingCategory);
}
public List<Category> getCategoryByName(String name){
    return categoryRepository.findByNameContainingIgnoringCase(name);
}
}
