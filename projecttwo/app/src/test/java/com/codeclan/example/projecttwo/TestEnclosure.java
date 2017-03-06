package com.codeclan.example.projecttwo;

import org.junit.Before;
import org.junit.Test;

import static com.codeclan.example.projecttwo.Type.ELECTRIC;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 06/03/2017.
 */

public class TestEnclosure {
    Animal animal;
    Enclosure enclosure;


    @Before
    public void before()

    {
        animal = new Animal("Gary", "Pikachu", ELECTRIC);
        enclosure = new Enclosure();

    }
    @Test
    public void testAddAnimal(){
        enclosure.addAnimal(animal);
        assertEquals(1, enclosure.getSize());
    }
}