package org.example.six;

import java.util.ArrayList;
import java.util.List;

// https://www.codewars.com/kata/55466989aeecab5aac00003e/train/java
public class SquaresInRectangle {
    public static List<Integer> sqInRect(int lng, int wdth) {
        if(lng == wdth) return null;

        List<Integer> squares = new ArrayList<>();
        int numOfSquares = lng * wdth;

        do {
            int minSide = Math.min(lng, wdth);
            numOfSquares -= minSide * minSide;
            squares.add(minSide);
            if (minSide == lng) {
                wdth -= lng;
            } else {
                lng -= wdth;
            }
        } while (numOfSquares > 0);
        return squares;
    }
}
