
package com.mycompany.java.people;

import com.mycompany.java.Rol;
import com.mycompany.java.TypeSport;


public class Sportsman extends Person  implements Doping, Diet{
  private TypeSport typeSport;
  private Category category;

    public Sportsman(TypeSport typeSport, Category category, String name, String ID, int age, String gender, Rol role) {
        super(name, ID, age, gender, role);
        this.typeSport = typeSport;
        this.category = category;
    }
    
    @Override
    public void doDopingTest(){
        System.out.println("Realizando test de dopaje");   
    }
    @Override
    public void doDiet(){
        if(this.typeSport == TypeSport.BASKETBALL){
            System.out.println("Dieta baketbolera");
            return;
        }
        if(this.typeSport == TypeSport.SOCCER) {
            System.out.println("Dieta futbolera");
            return;
        }
        if(this.typeSport == TypeSport.VOLLEYBALL) {
            System.out.println("Dieta voleibolera");
        }
    }
}
