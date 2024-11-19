package com.shrayansh;

import java.util.Random;

public class Util {
    private static Random rnd = new Random();

    public static int getRandomInt() {
        return rnd.nextInt();
    }
}
