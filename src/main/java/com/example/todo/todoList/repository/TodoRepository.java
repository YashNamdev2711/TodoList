package com.example.todo.todoList.repository;

import com.example.todo.todoList.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
    // You can add custom queries or methods if needed
}

