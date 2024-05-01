package com.raczadam.design_patterns.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

// invoker
public class Switcher {


    public final List<Command> commands = new ArrayList<>();


    public void add(Command command) {
        commands.add(command);
    }


    public void executeCommands() {
        commands.forEach(Command::execute);
    }


}
