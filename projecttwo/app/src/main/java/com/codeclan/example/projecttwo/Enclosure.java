package com.codeclan.example.projecttwo;

import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public class Enclosure {
    ArrayList animals;


    public Enclosure() {
        this.animals = new ArrayList();
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public int getSize(){
        return animals.size();
    }

//    public ArrayList<String> getAnimalNames() {
//
//    }
//
//    public String getListOfNames() {
//        ArrayList<String> names = getAnimalNames();
//        ...
//    }
}
