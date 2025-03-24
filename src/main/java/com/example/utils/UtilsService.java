package com.example.utils;

import org.springframework.stereotype.Component;

@Component
public class UtilsService {
    public String getInfo() {
        return "Я компонент из другого пакета!";
    }
}
