package com.raczadam.design_patterns.patterns.behavioral.command.advanced;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {


    public static final Logger logger = Logger.getLogger(App.class.getName());


    public static void main(String[] args) {
        logger.log(Level.INFO, "args: {0}", Arrays.toString(args));
        Algorithm algorithm = new Algorithm();

        Thread t1 = new Thread(algorithm::produce);
        Thread t2 = new Thread(algorithm::consume);

        t1.start();
        t2.start();
    }


}
