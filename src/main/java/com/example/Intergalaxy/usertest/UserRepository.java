// src/main/java/com/example/demo/repository/UserRepository.java
package com.example.Intergalaxy.usertest;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

