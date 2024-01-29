package com.jakhongir;

public class Main {
    public static void main(String[] args) {
        User user = new User("Jakhongir");
        System.out.println(user.name);
        user.sayHello();
        TaxCalculator calculator2022 = getCalculator();
        System.out.println(calculator2022.calculateTax());

        Account account = new Account();
        account.deposit(1000);
        System.out.println(account.getBalance());
        account.withdraw(100);
        System.out.println(account.getBalance());

        var mailService = new MailService();
        mailService.sendEmail();

        TextBox textBox = new TextBox();
        textBox.enable();
        textBox.disable();
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2022();
    }
}
