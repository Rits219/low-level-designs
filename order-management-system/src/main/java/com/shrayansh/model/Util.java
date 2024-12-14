package com.shrayansh.model;

import java.util.Random;

public class Util {
    private static Random random = new Random();

    public static int getRandomId() {
        return random.nextInt();
    }
}
