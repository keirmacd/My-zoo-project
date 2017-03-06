package com.codeclan.example.projecttwo;

import org.junit.Before;
import org.junit.Test;

import static com.codeclan.example.projecttwo.Type.FIRE;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 06/03/2017.
 */

public class TestAnimal {
    Animal animal;

    @Before
    public void before(){
        animal = new Animal("Charizard", "Charizard", FIRE);
    }

    @Test
    public void TestThatAnimalHasName(){
        assertEquals("Charizard" , animal.getName());
    }
}
