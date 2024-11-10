package com.jakhongir.patterns.bahavioral.command.composite;

import com.jakhongir.patterns.bahavioral.command.framework.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white command");
    }
}
