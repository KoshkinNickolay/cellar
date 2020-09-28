package ru.cellar;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CellarRandom {
    private List<Jar> jars = new ArrayList<>();
    private  Random random = new Random();
    private int jarsNumber = random.nextInt(10) + 1;
    private int vegetablesNumber;
    private String name;
    private Vegetables[] ingredients;
    private Vegetables vegetable;
    private Cellar cellar = new Cellar();

    public Cellar createJarRandom(){
       for (int i = 0; i < jarsNumber; i++) {
            name = "Банка №"+ i;
            vegetablesNumber = random.nextInt(10) + 1;
            ingredients = new Vegetables[vegetablesNumber];
           for (int j = 0; j < vegetablesNumber; j++) {
               vegetable = Vegetables.values()[random.nextInt(Vegetables.values().length)];
               ingredients[j] = vegetable;
           }
           try {
               cellar.pushJar(new Jar(name, ingredients));
           } catch (ExceptionUps e){
               System.out.println(e.getMessage());
           }



        }
       return cellar;
    }
}
