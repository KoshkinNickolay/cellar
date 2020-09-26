package ru.cellar;

import lombok.Data;

@Data
public class Jar {
    private String name;
    private Vegetables[] ingredients;
}
