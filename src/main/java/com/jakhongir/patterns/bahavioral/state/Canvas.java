package com.jakhongir.patterns.bahavioral.state;

public class Canvas {
    protected Tool currentTool;

    public void setCurrentTool(Tool tool) {
        currentTool = tool;
    }

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public void mouseDown() {
        currentTool.mouseDown();
    }
}
