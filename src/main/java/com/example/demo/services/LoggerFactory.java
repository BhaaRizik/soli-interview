package com.example.demo.services;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class LoggerFactory {
    private final Map<String, validation> map;

    public LoggerFactory(List<validation> validations) {
      this.map = validations.stream().collect(Collectors.toMap(validation::getType, value -> value));
    }

    public validation getInstance(String type) {
        return map.getOrDefault(type, null);
    }

}
