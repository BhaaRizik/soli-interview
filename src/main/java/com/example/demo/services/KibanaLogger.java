package com.example.demo.services;

import org.springframework.stereotype.Component;

@Component
public class KibanaLogger {
    public void writeToKibana(String log) {
        System.out.println("Kibana is: " + log);
    }

    public String getType() {
        return  "KIBANA";
    }
}

