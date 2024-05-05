package com.example;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        System.out.println("*****COKE*****"); 
        vendingMachine.selectSnack("Coke");
        vendingMachine.insertMoney(5.0);
        vendingMachine.dispenseSnack();

        System.out.println("*****PEPSI*****");
        vendingMachine.selectSnack("Pepsi");
        vendingMachine.insertMoney(1.0);
        vendingMachine.dispenseSnack();

        System.out.println("*****CHEETOS*****");
        vendingMachine.selectSnack("Cheetos");
        vendingMachine.insertMoney(3.50);
        vendingMachine.dispenseSnack();

        System.out.println("*****DORITOS*****");
        for (int i =0; i < 2; i++) {
            vendingMachine.selectSnack("Doritos");
            vendingMachine.insertMoney(2.0);
            vendingMachine.dispenseSnack();
        }

        System.out.println("*****KITKAT*****");
        vendingMachine.selectSnack("KitKat");
        vendingMachine.insertMoney(3.0);
        vendingMachine.dispenseSnack();


        System.out.println("*****SNICKERS*****");
        // Simulating multiple purchases of Snickers until quantity reaches 0
        for (int i = 0; i < 4; i++) {
            vendingMachine.selectSnack("Snickers");
            vendingMachine.insertMoney(2.0);
            vendingMachine.dispenseSnack();
        }
    }

    // Method to handle dispensing success message
    public static void printDispenseSuccess(String snackName) {
        System.out.println("Successfully dispensed " + snackName);
    }

    // Method to handle out of stock message
    public static void printOutOfStock(String snackName) {
        System.out.println("Sorry, " + snackName + " is out of stock.");

    }
}
