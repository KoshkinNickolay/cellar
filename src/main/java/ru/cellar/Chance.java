package ru.cellar;

import java.util.Random;

public class Chance {
    private static Random random = new Random();
    public static Boolean getException(int chance){
        return chance >= (random.nextInt(100) + 1);
    }
}
