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
    Food food;

    @Before
    public void before(){
        animal = new Animal("Charizard", "Charizard", FIRE);
        food = new Food();
    }

    @Test
    public void TestThatAnimalHasName(){
        assertEquals("Charizard" , animal.getName());
    }
    @Test
    public void TestThatAnimalHasSpecies(){
        assertEquals("Charizard" , animal.getSpecies());

    }
    @Test
    public void TestThatAnimalHasType(){
        assertEquals(FIRE, animal.getType());
    }
    @Test
    public void TestAnimalCanEat(){
        animal.eat(food);
        assertEquals(1, animal.getBellySize());
    }
}
