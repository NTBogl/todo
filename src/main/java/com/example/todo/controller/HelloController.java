package com.example.todo.controller;

import com.example.todo.service.MessageService;
import com.example.todo.service.TodoService;
import com.example.utils.UtilsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final UtilsService utilsService;

    public HelloController(UtilsService utilsService) {
        this.utilsService = utilsService;
    }

    @GetMapping("/utils")
    public String showUtils() {
        return utilsService.getInfo();
    }

//    private final MessageService messageService;
//
//    public HelloController(MessageService messageService) {
//        this.messageService = messageService;
//    }
//
//    @GetMapping("/custom-greeting")
//    public String greeting() {
//        return messageService.getMessage("мир");
//    }

//    private final TodoService todoService;
//
//    public HelloController(TodoService todoService) {
//        this.todoService = todoService;
//    }
//
//    @GetMapping("/greeting")
//    public String greeting() {
//        return todoService.getGreeting();
//    }
//
//    @GetMapping("/hello")
//    public String sayHello() {
//        return "Привет, мир!";
//    }
//
//    @GetMapping("/ping")
//    public String ping() {
//        return "pong";
//    }
}