package com.codeclan.example.projecttwo;

import java.util.ArrayList;

import static android.R.attr.type;
import static com.codeclan.example.projecttwo.Type.*;

/**
 * Created by user on 08/03/2017.
 */



public class Aquarium extends Enclosure {
    ArrayList animals;


    public void addAnimal(Animal animal) {


        if (animal.getType() == WATER || animal.getType() == ICE) {
            animals.add(animal);
            System.out.println("Added to enclosure");

        } else {
            System.out.println("There is a time and a place for everything, but not here");
        }
    }
}
