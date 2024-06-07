
package com.mycompany.java.people;

import com.mycompany.java.Rol;


public class Person {
    private String name;
    private String ID;
    private int age;
    private String gender;
    private Rol role;

    public Person(String name, String ID, int age, String gender, Rol role) {
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.gender = gender;
        this.role = role;
    }
}
