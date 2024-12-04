package com.raczadam.leetcode_practice.easy;

// https://leetcode.com/problems/stone-removal-game/description/
public class StoneRemovalGame {


    public boolean canAliceWin(int n) {
        int step = 10;
        int numberOfSteps = 0;
        while (n - step >= 0) {
            n -= step;
            step--;
            numberOfSteps++;
        }
        return numberOfSteps % 2 == 1;
    }


}
