package com.example.todo.service;

public class MessageService {
    private final String prefix;

    public MessageService(String prefix) {
        this.prefix = prefix;
    }

    public String getMessage(String name) {
        return prefix + ", " + name + "!";
    }
}
