package com.DSI.springjwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DSI.springjwt.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  Optional<User> findByUsername(String username);
 //Optional<User> findById(Long id);


  Boolean existsByUsername(String username);

  Boolean existsByEmail(String email);

  //User findById(Long id);
}