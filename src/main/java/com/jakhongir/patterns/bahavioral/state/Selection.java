package com.jakhongir.patterns.bahavioral.state;

public class Selection extends Tool {
    @Override
    public void mouseUp() {
        System.out.println("Mouse up for Selection");
    }

    @Override
    public void mouseDown() {
        System.out.println("Mouse down for Selection");
    }
}
