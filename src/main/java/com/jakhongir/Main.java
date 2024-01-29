package com.jakhongir;

public class Main {
    public static void main(String[] args) {
        User user = new User("Jakhongir");
        System.out.println(user.name);
        user.sayHello();
        TaxCalculator calculator2022 = getCalculator();
        System.out.println(calculator2022.calculateTax());
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2022();
    }
}
