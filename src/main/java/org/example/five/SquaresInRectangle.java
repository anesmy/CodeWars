package org.example.five;

import java.math.BigInteger;

// https://www.codewars.com/kata/559a28007caad2ac4e000083/train/java
public class SquaresInRectangle {
    public static BigInteger perimeter(BigInteger n) {
        BigInteger penultimate = BigInteger.ONE;
        BigInteger last = BigInteger.ONE;
        BigInteger sum = BigInteger.TWO;

        for (BigInteger i = BigInteger.ONE; n.compareTo(i) > 0; i = i.add(BigInteger.ONE)) {
            BigInteger current = last.add(penultimate);
            sum = sum.add(current);
            penultimate = last;
            last = current;
        }
        return sum.multiply(BigInteger.valueOf(4));
    }
}
