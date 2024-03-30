package com.raczadam.design_patterns.patterns.behavioral.observer;

public class Main {


    public static void main(String[] args) {
        StockExchange exchange = new StockExchange();
        exchange.addObserver(new BuyStockListener());
        exchange.addObserver(new SellStockListener());
        exchange.start();
    }


}
