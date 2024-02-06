package org.example.seven;

// https://www.codewars.com/kata/586f6741c66d18c22800010a/train/java
public class SumOfASequence {
    public static int sequenceSum(int start, int end, int step) {
        if (start > end) return 0;
        int result = 0;
        for (int i = start; i <= end; i+=step) {
            result += i;
        }
        return result;
    }
}
