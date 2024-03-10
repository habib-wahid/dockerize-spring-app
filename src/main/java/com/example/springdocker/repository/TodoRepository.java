package com.example.springdocker.repository;

import com.example.springdocker.model.Todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
