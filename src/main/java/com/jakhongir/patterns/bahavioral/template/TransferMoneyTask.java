package com.jakhongir.patterns.bahavioral.template;

public class TransferMoneyTask implements Transaction{
    public void execute() {
        System.out.println("Transfer money");
    }
}
