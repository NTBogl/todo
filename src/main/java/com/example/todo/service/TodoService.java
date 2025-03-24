package com.example.todo.service;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    public String getGreeting() {
        return "Сервис говрит привет!";
    }
}
