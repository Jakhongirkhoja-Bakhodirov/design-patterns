package com.jakhongir.patterns.bahavioral.command.composite;

import com.jakhongir.patterns.bahavioral.command.framework.Command;
import java.util.ArrayList;
import java.util.List;


public class CompositeCommand implements Command {
    protected List<Command> commands = new ArrayList<>();

    public void add(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for (var command:commands) {
            command.execute();
        }
    }
}
