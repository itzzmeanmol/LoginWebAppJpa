package com.aciworldwide.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aciworldwide.entities.User;
//Persistence layer
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	// JPQL - Java persistence query language: object oriented query language (it is not sql), so by default it will not understand sql
	@Query("select u from User u where u.username  = ?1") //Here 'User' is class name and username is the property of user class ---- and this query is case sensitive
	User findByUsername(String username);
	
	@Query("select u from User u where u.username  = ?1 and u.password = ?2")
	User findByUsernameAndPassword(String username,String password);
}
