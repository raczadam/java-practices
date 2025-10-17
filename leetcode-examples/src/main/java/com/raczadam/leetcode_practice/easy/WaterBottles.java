package com.raczadam.leetcode_practice.easy;

public class WaterBottles {


    public int numWaterBottles(int numBottles, int numExchange) {
        int result = numBottles;
        int exchange = numBottles / numExchange;
        int leftOver = numBottles % numExchange;
        while (exchange != 0) {
            int previousExchange = exchange;
            result += exchange;
            exchange = (exchange + leftOver) / numExchange;
            leftOver = (previousExchange + leftOver) % numExchange;
        }
        return result;
    }

    public static void main(String[] args) {
        /*
        Input: numBottles = 9, numExchange = 3
        Output: 13

        Input: numBottles = 15, numExchange = 4
        Output: 19
         */
        WaterBottles obj = new WaterBottles();
        System.out.println(obj.numWaterBottles(9, 3));
        System.out.println(obj.numWaterBottles(15, 4));
    }
}
