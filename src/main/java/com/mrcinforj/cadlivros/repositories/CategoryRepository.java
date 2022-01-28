package com.mrcinforj.cadlivros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrcinforj.cadlivros.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
