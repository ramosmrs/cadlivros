package com.mrcinforj.cadlivros.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrcinforj.cadlivros.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Marcio", "marcio.rsouza@gmail.com", "21999994444", "1234");
		return ResponseEntity.ok(u);
		
	}
}
