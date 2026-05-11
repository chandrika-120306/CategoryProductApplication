package com.application.CategoryProduct.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.application.CategoryProduct.entity.Category;
import com.application.CategoryProduct.service.CategoryService;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;
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
@GetMapping("/{id}")
public Category getCategoryById(@PathVariable long id){
return categoryService.getCategoryById(id);
}
@DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
        return "Category with id " + id + " deleted successfully";
    }
@PutMapping("/{id}")
public Category updateById(@PathVariable long id,@RequestBody Category category ){
    return categoryService.updateById(id,category);

}
@GetMapping("/search")
public List<Category> getByName(@RequestParam String name){
    return categoryService.getCategoryByName(name);
}
@GetMapping("/all")
public List<Category> getAllCategories(){
    return categoryService.getAllCategories();
}
}
