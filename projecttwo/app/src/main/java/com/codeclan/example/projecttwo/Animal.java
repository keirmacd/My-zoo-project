package com.codeclan.example.projecttwo;

import java.lang.reflect.Array;

/**
 * Created by user on 03/03/2017.
 */

public class Animal {
    String name;
    String species;
    Enum type;

    public Animal(String name, String species, Enum type) {
        this.name = name;
        this.species = species;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public Enum getType() {
        return type;
    }
}
