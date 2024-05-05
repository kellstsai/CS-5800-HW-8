package com.example;

public class DispensingSnackState implements StateOfVendingMachine {

    @Override
    public void selectSnack(VendingMachine vendingMachine, String snackName) {
        System.out.println("Currently processing another request.");
    }

    @Override
    public void insertMoney(VendingMachine vendingMachine, double money) {
        System.out.println("Currently processing another request.");
    }

    @Override
    public void dispenseSnack(VendingMachine vendingMachine) {
        Snack selectedSnack = vendingMachine.getSnack(vendingMachine.getSelectedSnack());
        double price = selectedSnack.getPrice();
        if(vendingMachine.getInsertedMoney() >= price) {
            if(selectedSnack.getQuantity() > 0) {
                System.out.println("Dispensing " + selectedSnack.getName());
                selectedSnack.lowerQuantity();
                double change = vendingMachine.getInsertedMoney() - price; 
                System.out.println("Change returned: $" + change);
                vendingMachine.setInsertedMoney(0);
                vendingMachine.setCurrentState(vendingMachine.getIdleState());
            }
            else {
                System.out.println("Sorry, " + selectedSnack.getName() + " is out of stock.");
                vendingMachine.setCurrentState(vendingMachine.getIdleState());
            }
        }
        else {
            System.out.println("Please insert more money to buy " + selectedSnack.getName());
            vendingMachine.setCurrentState(vendingMachine.getWaitingForMoneyState());
        }
    }
    
}
