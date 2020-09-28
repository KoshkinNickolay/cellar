package ru.cellar;

import java.util.ArrayList;
import java.util.List;

public class Cellar {
    private List<Jar> jars;

    public Cellar(){
        this.jars = new ArrayList<>();
    }

    //Добавление банки в погреб
    public void pushJar(Jar jar) throws ExceptionUps {
        if (Chance.getException(2)){
            throw new ExceptionUps("Вы выронили банку при добавлении");
        } else {
            this.jars.add(jar);
        }

    }

    // Достаем банку по имени
    public Jar getJar(String name) throws ExceptionUps {

        Jar jar = new Jar();
        for (Jar j : this.jars){
            if (name.equals(j.getName())) {
                if (Chance.getException(1)){
                    throw new ExceptionUps("Вы выронили банку при взятии");
                } else {
                    jar = j;
                }
                this.jars.remove(j);
                break;
            }
        }
       return jar;
    }

    // Список банок в погребе
    public void listJarsInCellar(){
        System.out.println("В погребе находятся:");
        for (Jar jar: jars){
            System.out.println(jar);
        }
    }
}
