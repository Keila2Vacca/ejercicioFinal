
package com.mycompany.java.scenaries;

import com.mycompany.java.TypeSport;


public class Scenario {
   private int capacity;
   private TypeSport typeSports;
   private String schedule;
   private boolean available;

    public Scenario(int capacity, TypeSport typeSports, String schedule) {
        this.capacity = capacity;
        this.typeSports = typeSports;
        this.schedule = schedule;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
