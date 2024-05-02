package com.raczadam.design_patterns.patterns.behavioral.command.advanced;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task {


    public static final Logger logger = Logger.getLogger(Task.class.getName());

    private final int id;


    public Task(int id) {
        this.id = id;
        logger.log(Level.INFO, "Task creating with ID {0}", Integer.toString(id));
    }


    public void solveProblem() {
        logger.log(Level.INFO, "Solving the problem with ID {0}", Integer.toString(id));
    }


}
