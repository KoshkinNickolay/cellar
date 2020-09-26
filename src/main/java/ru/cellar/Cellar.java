package ru.cellar;

import java.util.ArrayList;
import java.util.List;

public class Cellar {
    private List<Jar> Jars;

    public Cellar(){
        this.Jars = new ArrayList<>();
    }

    public void pushJar(Jar jar){
       this.Jars.add(jar);
    }

    public Jar getJar(String name){
        for (Jar j : this.Jars){
            if (name.equals(j.getName())) {return j;}

        }
        return new Jar();
    }
}
