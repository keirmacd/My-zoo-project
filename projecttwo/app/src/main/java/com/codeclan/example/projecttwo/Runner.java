package com.codeclan.example.projecttwo;

import java.util.Scanner;

import static android.R.attr.data;
import static com.codeclan.example.projecttwo.Type.ELECTRIC;
import static com.codeclan.example.projecttwo.Type.FIRE;
import static com.codeclan.example.projecttwo.Type.GRASS;
import static com.codeclan.example.projecttwo.Type.WATER;

/**
 * Created by user on 06/03/2017.
 */

public class  Runner {


    public static void main(String[] args) {
        Zoo zoo;
        Enclosure enclosure1;
        Enclosure enclosure2;
        Enclosure enclosure3;
        Enclosure enclosure4;
        Food food;
        Animal animal1;
        Animal animal2;
        Animal animal3;
        Animal animal4;

        zoo = new Zoo();
        enclosure1 = new Enclosure();
        enclosure2 = new Enclosure();
        enclosure3 = new Enclosure();
        enclosure4 = new Enclosure();
        food = new Food();
        animal1 = new Animal("Gary", "Blastoise", WATER);
        animal2 = new Animal("Sparky", "Pikachu", ELECTRIC);
        animal3 = new Animal("Lizardon", "Charizard", FIRE);
        animal4 = new Animal("Green", "Venasaur", GRASS);
        enclosure1.addAnimal(animal1);
        System.out.println(animal1.getName() + " the " + animal1.getSpecies() + " which is a " + animal1.getType() + " pokemon");
        enclosure2.addAnimal(animal2);
        System.out.println(animal2.getName() + " the " + animal2.getSpecies() + " which is a " + animal2.getType() + " pokemon");
        enclosure3.addAnimal(animal3);
        System.out.println(animal3.getName() + " the " + animal3.getSpecies() + " which is a " + animal3.getType() + " pokemon");
        enclosure4.addAnimal(animal4);
        System.out.println(animal4.getName() + " the " + animal4.getSpecies() + " which is a " + animal4.getType() + " pokemon");
    }
}
