package com.raczadam.design_patterns.solid.liskov_subtitution;

import static java.lang.StringTemplate.STR;

public abstract class CarImpl implements Car {

    @Override
    public void speedUp() {
        System.out.println(STR."\{this.getClass().getSimpleName()} speed up");
    }

    @Override
    public void speedDown() {
        System.out.println(STR."\{this.getClass().getSimpleName()} speed down");
    }

}
