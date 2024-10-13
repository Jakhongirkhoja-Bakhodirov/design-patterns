package com.jakhongir.patterns.bahavioral.strategy.filter;

public class HighContrast implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying high-contrast filter to " + fileName + " file");
    }
}
