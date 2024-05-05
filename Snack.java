package com.example;
import java.util.HashMap;

public class Snack {
    public String name; 
    public double price; 
    public int quantity; 

    public Snack(String name, double price, int quantity) {
        this.name = name; 
        this.price = price;
        this.quantity = quantity; 
    }

    public String getName() {
        return name; 
    }

    public double getPrice() {
        return price; 
    }

    public int getQuantity() {
        return quantity; 
    }

    public void lowerQuantity() {
        quantity--;
    }

    public void raiseQuantity() {
        quantity++; 
    }

}
