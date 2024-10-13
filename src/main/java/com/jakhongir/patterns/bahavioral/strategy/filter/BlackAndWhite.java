package com.jakhongir.patterns.bahavioral.strategy.filter;

public class BlackAndWhite implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Applying high-contrast filter to " + fileName + " file");
    }
}
