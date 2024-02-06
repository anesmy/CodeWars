package org.example.five;

import java.util.Arrays;

// https://www.codewars.com/kata/5270d0d18625160ada0000e4/train/java
public class Greed {
    public static int greedy(int[] dice) {
        int[] score = new int [6];
        Arrays.stream(dice).forEach(el -> score[el - 1]++);

        int finalScore = 0;
        int triple;
        for (int i = 0; i < score.length; i++) {
            triple = i == 0 ? 1000 : (i + 1) * 100;
            finalScore += score[i] / 3 * triple;
        }
        finalScore += score[4] % 3 * 50;
        finalScore += score[0] % 3 * 100;
        return finalScore;
    }
}
