package org.example.five;

// https://www.codewars.com/kata/513e08acc600c94f01000001/train/java
public class RgbToHex {
    public static String rgb(int r, int g, int b) {
        return String.format("%1$02X", roundValue(r)) + String.format("%1$02X", roundValue(g))
                + String.format("%1$02X", roundValue(b));
    }

    public static int roundValue(int v) {
        return v < 0 ? 0 : Math.min(v, 255);
    }
}
