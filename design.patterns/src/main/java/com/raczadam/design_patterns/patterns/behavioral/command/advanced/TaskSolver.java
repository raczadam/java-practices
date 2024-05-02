package com.raczadam.design_patterns.patterns.behavioral.command.advanced;

import com.raczadam.design_patterns.patterns.behavioral.command.Command;

public class TaskSolver implements Command {


    private final Task task;


    public TaskSolver(Task task) {
        this.task = task;
    }


    @Override
    public void execute() {
        this.task.solveProblem();
    }


}
