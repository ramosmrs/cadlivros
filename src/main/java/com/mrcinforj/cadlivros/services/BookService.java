package com.mrcinforj.cadlivros.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrcinforj.cadlivros.entities.Book;
import com.mrcinforj.cadlivros.repositories.BookRepository;

@Service
public class BookService {
 
	@Autowired
	private BookRepository repository;
	
	public List<Book> findAll(){
		return repository.findAll();
	}
	
	public Book findById(Long id) {
		Optional<Book> obj = repository.findById(id);
		return obj.get();
	}
	
	public Book insert(Book obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Book update(long id, Book obj) {
		Book entity = repository.getById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(Book entity, Book obj) {
		entity.setTitle(obj.getTitle());
		entity.setAuthor(obj.getAuthor());
		entity.setPages(obj.getPages());
		entity.setCategory(obj.getCategory());
	}
}
