package com.example.demo.services;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class App {
    //OOP
    //1. add validation method for all components
    //2. Usxe abstract method to prevent duplication
    //3. add custom validation

    //Spring
    //Factory
    //aktar men instance

    public App(LoggerFactory loggerFactory) {
        String input = "S3";
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        S3Logger bean = context.getBean(S3Logger.class);
        S3Logger bean1 = context.getBean(S3Logger.class);

        validation validation = loggerFactory.getInstance(input);
        if (validation != null) {
            validation.write("Hello S3");
        }
    }


}
