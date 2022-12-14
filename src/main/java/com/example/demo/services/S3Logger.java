package com.example.demo.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class S3Logger extends validation{
    public boolean isActive;

    public S3Logger() {
    }

    public void exc(String log) {
            System.out.println("S3 log -  " + log);
    }

    @Override
    protected boolean customValidation(String log) {
        return false;
    }

    public String getType() {
        return  "S3";
    }
}
