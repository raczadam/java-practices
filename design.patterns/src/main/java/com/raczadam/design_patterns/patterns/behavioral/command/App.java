package com.raczadam.design_patterns.patterns.behavioral.command;

public class App {


    public static void main(String[] args) {
        Light light = new Light();

        Switcher switcher = new Switcher();
        switcher.add(new TurnOnCommand(light));
        switcher.add(new TurnOffCommand(light));

        switcher.executeCommands();
    }


}
