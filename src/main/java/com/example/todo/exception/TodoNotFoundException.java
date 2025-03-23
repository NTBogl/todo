package com.example.todo.exception;

public class TodoNotFoundException extends RuntimeException{
    public TodoNotFoundException(Long id) {
        super("Задача с ID " + id + " не найдена");
    }
}
