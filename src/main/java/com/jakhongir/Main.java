package com.jakhongir;

import com.jakhongir.oop.incapsulation.Account;
import com.jakhongir.oop.abstraction.MailService;
import com.jakhongir.oop.User;
import com.jakhongir.oop.inheritance.CheckBox;
import com.jakhongir.patterns.bahavioral.Editor;
import com.jakhongir.oop.inheritance.TextBox;
import com.jakhongir.oop.inheritance.UIControl;
import com.jakhongir.oop.interfaces.TaxCalculator;
import com.jakhongir.oop.interfaces.TaxCalculator2022;

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

        var editor = new Editor();
        editor.setContent("a");
        editor.setContent("b");
        editor.setContent("c");
        editor.undo();
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2022();
    }

    public static void drawUIControl(UIControl control) {
        control.draw();
    }
}
