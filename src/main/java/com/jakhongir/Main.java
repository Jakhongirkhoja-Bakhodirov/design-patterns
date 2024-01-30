package com.jakhongir;

import org.w3c.dom.Text;

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

        drawUIControl(new CheckBox());
        drawUIControl(new TextBox());
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2022();
    }

    public static void drawUIControl(UIControl control) {
        control.draw();
    }
}
