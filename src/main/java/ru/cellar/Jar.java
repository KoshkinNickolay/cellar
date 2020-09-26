package ru.cellar;

import lombok.Data;

@Data
public class Jar {
    private String name;
    private Vegetables[] ingredients;
    public Jar(String name, Vegetables[] ingredients){
        this.name = name;
        this.ingredients = ingredients;
    }
    public Jar(){

    }

}
