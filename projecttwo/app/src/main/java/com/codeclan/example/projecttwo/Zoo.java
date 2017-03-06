package com.codeclan.example.projecttwo;

import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public class Zoo {
   private ArrayList<Enclosure> enclosures;

    public Zoo() {
        this.enclosures = new ArrayList<Enclosure>();
    }

    public int getNumberofEnclosures() {
        return enclosures.size();
    }

    public void addEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
    }
}

