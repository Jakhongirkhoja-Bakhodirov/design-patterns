package com.jakhongir.patterns.bahavioral.state;

public class Brush extends Tool{

    @Override
    public void mouseUp() {
        System.out.println("Mouse up for Brush");
    }

    @Override
    public void mouseDown() {
        System.out.println("Mouse down for Brush");
    }
}
