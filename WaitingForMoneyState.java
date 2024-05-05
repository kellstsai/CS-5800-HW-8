package com.example;

public class WaitingForMoneyState implements StateOfVendingMachine{

    @Override
    public void selectSnack(VendingMachine vendingMachine, String snackName) {
        System.out.println("The selected snack is: " + snackName);
        vendingMachine.setSelectedSnack(snackName);
    }

    @Override
    public void insertMoney(VendingMachine vendingMachine, double money) {
        vendingMachine.setInsertedMoney(money);
        System.out.println("Amount inserted is: $" + money);
        vendingMachine.setCurrentState(vendingMachine.getDispensingSnackState());
    }

    @Override
    public void dispenseSnack(VendingMachine vendingMachine) {
        System.out.println("Please insert money in first.");
    }
    
}
