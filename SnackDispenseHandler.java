package com.example;

public interface SnackDispenseHandler {
    public void setNextHandler(SnackDispenseHandler handler); 
    public void dispense(Snack snack, double money); 
}
