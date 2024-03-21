package com.raczadam.design_patterns.architectural.solid.dependency_inversion;

import java.util.stream.Stream;
public class Main {


    public static void main(String[] args) {
        final WebStore webStore = new WebStore();
        Stream.of(WebStore.Payment.values()).forEach(webStore::pay);
    }

}
