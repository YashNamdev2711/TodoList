package com.example.todo.todoList.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String todo;
    private String status;
    private String priority;

    // Constructors, getters, and setters insted we are using Lombok's @Data annoation for getter setter
    // and @AllArgsConstructor for parameterise constructor and @NoArgsConstructor for void constuctor
}
