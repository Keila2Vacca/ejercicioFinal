
package com.mycompany.java;

import com.mycompany.java.scenaries.Scenario;
import com.mycompany.java.sportscenter.SportCenter;

/*
un complejo deportivo necesita saber si un campo esta disponible o no para reservar, ofertar los diferentes escenarios y más
hay entrenadores y deportistas
TODOS LOS DEPORTISTAS DEBEN HACERSE UN PRUEBE ANTIDOPING  
plan de alimentacion para los deportistas y depente del deporte
solo entrenadores y deportistas pueden reservar y saber quien reservó
*/

public class SportsCenter {

    public static void main(String[] args) {
      SportCenter sportCenter = new SportCenter("el campin", "jnfg", "Bogotá", "de 9 a 6");  
      Scenario scenario1 = new Scenario(1800, TypeSport.SOCCER, "de 4 a 9");
      Scenario scenario2 = new Scenario(2000, TypeSport.VOLLEYBALL, "de 2 a 9");
      
      sportCenter.addScenario(scenario1);
      sportCenter.addScenario(scenario2);
      
      sportCenter.bookScenario(scenario1);
      sportCenter.bookScenario(scenario2);
      sportCenter.bookScenario(scenario1);
      
    }
}
