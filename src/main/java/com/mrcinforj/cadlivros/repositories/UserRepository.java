package com.mrcinforj.cadlivros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrcinforj.cadlivros.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
