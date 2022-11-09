package com.tadkey.java.web.com.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tadkey.java.web.com.spring.boot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
