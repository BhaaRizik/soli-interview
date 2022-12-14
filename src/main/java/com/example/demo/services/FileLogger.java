package com.example.demo.services;

import org.springframework.stereotype.Component;

@Component
public class FileLogger {
    public void writeToFile(String log) {
        System.out.println("File is: " + log);
    }

    public String getType() {
        return  "FILE";
    }
}
