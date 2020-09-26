package ru.cellar;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cellar cellar = new Cellar();
        Jar jar;
        jar = new Jar("Jar1",new Vegetables[]{Vegetables.TOMATO, Vegetables.CUCUMBER, Vegetables.CABBAGE});
        cellar.pushJar(jar);
        jar = new Jar("Jar2",new Vegetables[]{Vegetables.PEPPER, Vegetables.CABBAGE});
        cellar.pushJar(jar);
        jar = cellar.getJar("Jar1");
        System.out.println(jar);
    }
}
