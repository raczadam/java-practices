package com.raczadam.design_patterns.solid.single_responsibility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SingleResponsibility {

    public static final int THRESHOLD = 5;

    public static void main(String[] args) {

        System.out.println("Welcome to the Application!");

        List<Integer> numbers = getInput();

        Collections.sort(numbers);

        printNumbers(numbers);
    }


    private static List<Integer> getInput() {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 5 valid integers in the range [0, 10]");

        while (numbers.size() < THRESHOLD) {
            String s = scanner.nextLine();

            if (!isGivenStringInteger(s)) {
                continue;
            }

            int num = Integer.parseInt(s);
            if (isInRange(num)) {
                numbers.add(num);
            }
        }

        scanner.close();
        return numbers;
    }


    private static boolean isGivenStringInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;

        } catch (NumberFormatException nfe) {
            System.err.println(s + " is not a number! Try again!");
            return false;
        }
    }


    private static boolean isInRange(int num) {
        if (num < 0 || num > 10) {
            System.err.println("Invalid range! Try again!");
            return false;
        }
        return true;
    }


    private static void printNumbers(List<Integer> numbers) {
        numbers.forEach(number -> System.out.print(number + " "));
    }

}
