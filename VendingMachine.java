package com.example;

import java.util.HashMap;

public class VendingMachine {
    public StateOfVendingMachine currentState; 
    public HashMap<String, Snack> snacks = new HashMap<>(); 
    public String selectedSnack; 
    public double insertedMoney; 

    public VendingMachine() {
        currentState = new IdleState(); 
        initializeSnacks(); 
    }

    public void initializeSnacks() {
        snacks.put("Coke", new Snack("Coke", 1.75, 3));
        snacks.put("Pepsi", new Snack("Pepsi", 1.5, 4));
        snacks.put("Cheetos", new Snack("Cheetos", 2.0, 3));
        snacks.put("Doritos", new Snack("Doritos", 2.0, 6));
        snacks.put("KitKat", new Snack("KitKat", 1.0, 2));
        snacks.put("Snickers", new Snack("Snickers", 1.5, 3));
    }

    public void selectSnack(String snackName) {
        currentState.selectSnack(this, snackName);
    }

    public void insertMoney(double money) {
        currentState.insertMoney(this, money);
    }

    public void dispenseSnack() {
        currentState.dispenseSnack(this);
    }

    public StateOfVendingMachine getDispensingSnackState() {
        return new DispensingSnackState(); 
    }

    public StateOfVendingMachine getWaitingForMoneyState() {
        return new WaitingForMoneyState(); 
    }

    public StateOfVendingMachine getIdleState() {
        return new IdleState(); 
    }

    public Snack getSnack(String name) {
        return snacks.get(name); 
    }

    public double getInsertedMoney() {
        return insertedMoney; 
    }

    public String getSelectedSnack() {
        return selectedSnack; 
    }
    
    public void setSelectedSnack(String selectedSnack) {
        this.selectedSnack = selectedSnack; 
    }

    public void setCurrentState(StateOfVendingMachine currentState) {
        this.currentState = currentState; 
    }

    public void setInsertedMoney(double insertedMoney) {
        this.insertedMoney = insertedMoney; 
    }


}
