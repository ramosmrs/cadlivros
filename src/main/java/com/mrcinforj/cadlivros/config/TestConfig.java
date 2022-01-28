package com.mrcinforj.cadlivros.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mrcinforj.cadlivros.entities.Book;
import com.mrcinforj.cadlivros.entities.Category;
import com.mrcinforj.cadlivros.entities.User;
import com.mrcinforj.cadlivros.repositories.BookRepository;
import com.mrcinforj.cadlivros.repositories.CategoryRepository;
import com.mrcinforj.cadlivros.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 

		Category c1 = new Category(null, "Ficção Científica");
		Category c2 = new Category(null, "Organização");
		Category c3 = new Category(null, "Informática");
		Category c4 = new Category(null, "Romance");
		Category c5 = new Category(null, "Auto ajuda");

		
		Book b1 = new Book(null, "Recursão", "Blake Crouch", 500, Instant.parse("2022-01-25T19:53:07Z"), u1, c1);
		Book b2 = new Book(null, "O poder do hábito", "Charles Duhigg", 222, Instant.parse("2022-01-25T20:00:07Z"), u1, c2);
		Book b3 = new Book(null, "Todo esse tempo", "Rachael Lippincott", 444, Instant.parse("2022-01-25T21:10:09Z"), u1, c4);
		Book b4 = new Book(null, "A cinco passos de você", "Mikki Daughtry", 253, Instant.parse("2022-01-12T21:10:09Z"), u2, c4);
		Book b5 = new Book(null, "Pessoas normais", "Sally Rooney", 651, Instant.parse("2022-01-15T20:10:09Z"), u2, c5);
		
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		categoryRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5));
		bookRepository.saveAll(Arrays.asList(b1, b2, b3, b4, b5));
		
	}
}
