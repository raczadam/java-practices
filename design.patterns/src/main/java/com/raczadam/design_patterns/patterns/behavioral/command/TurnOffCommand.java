package com.raczadam.design_patterns.patterns.behavioral.command;

public class TurnOffCommand implements Command {


    private final Light light;


    public TurnOffCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        this.light.turnOff();
    }


}