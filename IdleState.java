package com.example;

public class IdleState implements StateOfVendingMachine {

    @Override
    public void selectSnack(VendingMachine vendingMachine, String snackName) {
        System.out.println("The selected snack is: " + snackName);
        vendingMachine.setSelectedSnack(snackName); 
        vendingMachine.setCurrentState(vendingMachine.getWaitingForMoneyState());
    }

    @Override
    public void insertMoney(VendingMachine vendingMachine, double money) {
        System.out.println("Please make a snack selection."); 
    }

    @Override
    public void dispenseSnack(VendingMachine vendingMachine) {
        System.out.println("Please make a snack selection and then insert the money."); 
    }
    
}
