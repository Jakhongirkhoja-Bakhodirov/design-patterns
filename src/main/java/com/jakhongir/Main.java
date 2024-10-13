package com.jakhongir;

import com.jakhongir.oop.incapsulation.Account;
import com.jakhongir.oop.abstraction.MailService;
import com.jakhongir.oop.User;
import com.jakhongir.oop.inheritance.CheckBox;
import com.jakhongir.patterns.bahavioral.command.AddCustomerCommand;
import com.jakhongir.patterns.bahavioral.command.CustomerService;
import com.jakhongir.patterns.bahavioral.command.framework.Button;
import com.jakhongir.patterns.bahavioral.iterator.BrowserHistory;
import com.jakhongir.patterns.bahavioral.iterator.Iterator;
import com.jakhongir.patterns.bahavioral.momento.Editor;
import com.jakhongir.oop.inheritance.TextBox;
import com.jakhongir.oop.inheritance.UIControl;
import com.jakhongir.oop.interfaces.TaxCalculator;
import com.jakhongir.oop.interfaces.TaxCalculator2022;
import com.jakhongir.patterns.bahavioral.momento.History;
import com.jakhongir.patterns.bahavioral.state.Brush;
import com.jakhongir.patterns.bahavioral.state.Canvas;
import com.jakhongir.patterns.bahavioral.state.Selection;
import com.jakhongir.patterns.bahavioral.strategy.ImageStorage;
import com.jakhongir.patterns.bahavioral.strategy.compressor.JpegCompressor;
import com.jakhongir.patterns.bahavioral.strategy.compressor.PngCompressor;
import com.jakhongir.patterns.bahavioral.strategy.filter.BlackAndWhite;
import com.jakhongir.patterns.bahavioral.strategy.filter.HighContrast;
import com.jakhongir.patterns.bahavioral.template.AuditTrail;
import com.jakhongir.patterns.bahavioral.template.GenerateReportTask;
import com.jakhongir.patterns.bahavioral.template.TransactionExecutor;
import com.jakhongir.patterns.bahavioral.template.TransferMoneyTask;

public class Main {
    public static void main(String[] args) {
        /*
         * Example of OOP Class
         */
        User user = new User("Jakhongir");
        System.out.println(user.name);
        user.sayHello();

        /*
         * Example of OOP Interface
         */
        TaxCalculator calculator2022 = getCalculator();
        System.out.println(calculator2022.calculateTax());

        /*
         * Example of OOP Encapsulation
         */
        Account account = new Account();
        account.deposit(1000);
        System.out.println(account.getBalance());
        account.withdraw(100);
        System.out.println(account.getBalance());


        /*
         * Example of OOP Abstraction
         */
        var mailService = new MailService();
        mailService.sendEmail();

        /*
         * Example of OOP Inheritance
         */
        TextBox textBox = new TextBox();
        textBox.enable();
        textBox.disable();

        /*
         * Example of OOP Polymorphism
         */
        drawUIControl(new CheckBox());
        drawUIControl(new TextBox());

        /*
         * Example of Momento behavioral pattern
         */
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());

        System.out.println("\nExample of Momento Pattern:\n");
        System.out.println("Previous editor state is " + editor.getContent());

        /*
         * Example of State behavioral pattern
         */
        var canvas = new Canvas();
        var selectionTool = new Selection();
        var brushTool = new Brush();

        System.out.println("\n Example of State Pattern:\n");

        canvas.setCurrentTool(selectionTool);
        canvas.mouseUp();
        canvas.mouseDown();

        canvas.setCurrentTool(brushTool);
        canvas.mouseUp();
        canvas.mouseDown();

        /*
         * Example of Iterator behavioral pattern
         */
        var browserHistory = new BrowserHistory();
        browserHistory.push("a");
        browserHistory.push("b");
        browserHistory.push("c");
        System.out.println("\n Example of Iterator Pattern:\n");

        Iterator iterator = browserHistory.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }

        /*
         * Example of Strategy pattern
         */
        System.out.println("\n Example of Strategy Pattern:\n");
        var imageStorage = new ImageStorage();
        imageStorage.store("image.png", new PngCompressor(), new HighContrast());
        imageStorage.store("image.jpg", new JpegCompressor(), new BlackAndWhite());

        /*
         * Example of Template pattern
         */
        System.out.println("\n Example of Template Pattern:\n");
        var transactionExecutor = new TransactionExecutor(new AuditTrail());
        transactionExecutor.execute(new TransferMoneyTask());
        transactionExecutor.execute(new GenerateReportTask());

        /*
         * Example of Template pattern
         */
        System.out.println("\n Example of Template Pattern:\n");
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2022();
    }

    public static void drawUIControl(UIControl control) {
        control.draw();
    }
}
