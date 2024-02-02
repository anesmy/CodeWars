package org.example.eight;

import java.util.Arrays;
import java.util.stream.IntStream;

// https://www.codewars.com/kata/5513795bd3fafb56c200049e/train/java
public class CountByX {
    public static int[] countBy(int x, int n){
        return IntStream.range(1, n + 1)
                .map(num -> num * x)
                .toArray();
    }
}
