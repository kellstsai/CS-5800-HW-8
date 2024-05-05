package com.example;

public interface StateOfVendingMachine {
    public void selectSnack(VendingMachine vendingMachine, String snackName);
    public void insertMoney(VendingMachine vendingMachine, double money);
    public void dispenseSnack(VendingMachine vendingMachine);
}
