package com.application.CategoryProduct.repository;
import com.application.CategoryProduct.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
public interface CategoryRepository  extends JpaRepository<Category,Long>{
List<Category> findByNameContainingIgnoringCase(String name);
}
