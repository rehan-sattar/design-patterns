package com.company;

import com.company.fx.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommands implements Command {
    private final List<Command> commands = new ArrayList<>();

    public void add(Command newCommand) {
        commands.add(newCommand);
    }

    @Override
    public void execute() {
        for(var command : commands) {
            command.execute();
        }
    }
}
