package ru.cellar;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static String findJar = "Ассорти";

    public static void main(String[] args) {
        Cellar cellar = new Cellar();
        Jar jar;

        jar = new Jar("Лечо",new Vegetables[]{Vegetables.TOMATO, Vegetables.CABBAGE});
        try {
            cellar.pushJar(jar);
        } catch (ExceptionUps e){
            System.out.println(e.getMessage());
        }

        jar = new Jar("Капуста",new Vegetables[]{Vegetables.CABBAGE});
        try {
            cellar.pushJar(jar);
        } catch (ExceptionUps e){
            System.out.println(e.getMessage());
        }

        jar = new Jar("Ассорти", new Vegetables[]{Vegetables.TOMATO, Vegetables.CUCUMBER});
        try {
            cellar.pushJar(jar);
        } catch (ExceptionUps e){
            System.out.println(e.getMessage());
        }

        jar = new Jar("Лечо",new Vegetables[]{Vegetables.TOMATO, Vegetables.CABBAGE});
        try {
            cellar.pushJar(jar);
        } catch (ExceptionUps e){
            System.out.println(e.getMessage());
        }
        jar = new Jar("Ассорти", new Vegetables[]{Vegetables.TOMATO, Vegetables.CUCUMBER});
        try {
            cellar.pushJar(jar);
        } catch (ExceptionUps e){
            System.out.println(e.getMessage());
        }
        jar = new Jar("Томаты", new Vegetables[]{Vegetables.TOMATO});
        try {
            cellar.pushJar(jar);
        } catch (ExceptionUps e){
            System.out.println(e.getMessage());
        }
        cellar.listJarsInCellar();

        try {
            jar = cellar.getJar(findJar);
            if (!jar.IsNull()){
                System.out.println("Вы достали " + jar);
            } else {
                System.out.println("Такой банки нет");
            }
        } catch (ExceptionUps e){
            System.out.println(e.getMessage());
        }

    }
}
