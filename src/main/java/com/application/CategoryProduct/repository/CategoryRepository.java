package com.application.CategoryProduct.repository;
import com.application.CategoryProduct.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CategoryRepository  extends JpaRepository<Category,Long>{

}
