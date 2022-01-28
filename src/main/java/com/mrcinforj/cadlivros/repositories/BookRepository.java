package com.mrcinforj.cadlivros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrcinforj.cadlivros.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
