package com.codeclan.example.projecttwo;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public class Animal {
    String name;
    String species;
    Enum type;
    ArrayList belly;


    public Animal(String name, String species, Enum type) {
        this.name = name;
        this.species = species;
        this.type = type;
        this.belly = new ArrayList<>();
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

    public void eat(Food food) {
        belly.add(food);
    }
    public int getBellySize(){
        return belly.size();
    }


}
