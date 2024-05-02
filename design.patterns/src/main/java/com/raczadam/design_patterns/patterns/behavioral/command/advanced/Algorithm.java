package com.raczadam.design_patterns.patterns.behavioral.command.advanced;

import com.raczadam.design_patterns.patterns.behavioral.command.Command;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Algorithm {


    public static final Logger logger = Logger.getLogger(Algorithm.class.getName());

    private final BlockingQueue<Command> queue;


    public Algorithm() {
        this.queue = new LinkedBlockingQueue<>();
    }


    public void produce() {
        try {
            for (int i = 1; i <= 10; i++) {
                queue.put(new TaskSolver(new Task(i)));
            }
        } catch (InterruptedException e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
            Thread.currentThread().interrupt();
        }
    }


    public void consume() {
        try {
            for (int i = 1; i <= 10; i++) {
                Thread.sleep(500L);
                queue.take().execute();
            }
        } catch (InterruptedException e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
            Thread.currentThread().interrupt();
        }
    }


}
