package com.jakhongir;

public class Account {
    private float balance;
    public  void setBalance(float balance) {
        if(balance > 0) {
            this.balance = balance;
        }
    }

    public  float getBalance() {
        return balance;
    }
}
