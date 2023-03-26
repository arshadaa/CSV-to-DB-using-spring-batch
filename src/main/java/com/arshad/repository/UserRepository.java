package com.arshad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arshad.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
