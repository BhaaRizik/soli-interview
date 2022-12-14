package com.example.demo.services;

public abstract class validation {

    protected boolean validate (String log) {
        return log != null;
    }

    public void write(String log) {
        if (validate(log) && customValidation((log))) {
            exc(log);
        }
    }

    protected boolean customValidation(String log) {
        return true;
    }

    protected abstract void exc(String log);
    public abstract String getType();
}
