package com.shrayansh;

import java.util.Random;

public class Util {
    private static Random random = new Random();

    public static int getRandomNumber(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    public static int getRandomInt() {
        return random.nextInt();
    }
}
