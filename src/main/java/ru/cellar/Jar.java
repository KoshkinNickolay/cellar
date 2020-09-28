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

    public Jar() {

    }

    public Boolean IsNull(){
        return (this.name == null) && (this.ingredients == null);
    }

    @Override
    public String toString(){
        String str = "\"" + this.name + "\" " + "состав: ";
        for (Vegetables vegetables: ingredients){
            str += vegetables + " ";
        }
        return str;
    }
}
