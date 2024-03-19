package com.raczadam.design_patterns.solid.open_close;

public class Main {

    public static void main(String[] args) {
        SortingProcessor.sort(new MergeSort());
        SortingProcessor.sort(new InsertionSort());
        SortingProcessor.sort(new SelectionSort());
    }


}
