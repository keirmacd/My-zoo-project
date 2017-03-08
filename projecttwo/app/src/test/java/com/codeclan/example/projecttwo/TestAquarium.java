package com.codeclan.example.projecttwo;

import org.junit.Before;
import org.junit.Test;

import static com.codeclan.example.projecttwo.Type.*;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 08/03/2017.
 */

public class TestAquarium {
    Animal animal;
    Enclosure aquarium;
    @Before
    public void before() {


            animal = new Animal("Blue", "Blastoise", WATER);
            aquarium = new Enclosure();

        }
        @Test
        public void testAddAnimal(){
        aquarium.addAnimal(animal);
        assertEquals(1, aquarium.getSize());
    }
        @Test
        public void testRemoveAnimal(){
        aquarium.removeAnimal(animal);
        assertEquals(0, aquarium.getSize());
    }
    }


