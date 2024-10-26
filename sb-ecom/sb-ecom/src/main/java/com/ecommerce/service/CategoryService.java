package com.ecommerce.service;

import com.ecommerce.model.Category;
import com.ecommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public Category saveCategory(Category category){
        return categoryRepository.save(category);
    }

    public List<Category> getAllCategories() {
      return    categoryRepository.findAll();
    }

    public Category findCategoryById(String id) {
     Optional<Category> category = categoryRepository.findById(id);
     return category.get();
    }
}
