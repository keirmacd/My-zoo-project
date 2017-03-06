package com.codeclan.example.projecttwo;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 03/03/2017.
 */

public class TestZoo {
    Zoo zoo;
    Enclosure enclosure;

    @Before
    public void before(){
        zoo = new Zoo();
    }
    @Test
    public void testZooIsEmpty(){
        assertEquals(0, zoo.getNumberofEnclosures());
    }
    @Test
    public void testThatICanAddAnEnclosure(){
        zoo.addEnclosure(enclosure);
        assertEquals(1, zoo.getNumberofEnclosures());
    }

}
