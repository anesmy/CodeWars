package org.example.six;

// https://www.codewars.com/kata/5287e858c6b5a9678200083c/train/java
public class DoesMyNumberLookBigInThis {
    public static boolean isNarcissistic(int number) {
        int length = Integer.toString(number).length();
        int digit;
        int res = number;
        while(number > 0) {
            digit = number % 10;
            res -= Math.pow(digit, length);
            number /= 10;
        }
        return res == 0;
    }
}
