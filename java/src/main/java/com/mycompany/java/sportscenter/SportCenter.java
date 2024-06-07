
package com.mycompany.java.sportscenter;

import com.mycompany.java.scenaries.Scenario;
import java.util.ArrayList;
import java.util.List;

public class SportCenter {
  private String name;
  private String ID;
  private String location;
  private String schedule;
  //schedule = horario

    public SportCenter(String name, String ID, String location, String schedule) {
        this.name = name;
        this.ID = ID;
        this.location = location;
        this.schedule = schedule;
    }
  
  List<Scenario> scenaries = new ArrayList<>();
  
  public void addScenario (Scenario scenario){
    this.scenaries.add(scenario);
  }
  
  public void bookScenario(Scenario scenario){
    int index = this.scenaries.indexOf(scenario);
    
    //indexOf para sabaer la posición del objeto buscado si si no existe bota-1
    
    Scenario sc =this.scenaries.get(index);
    
    if(sc.isAvailable()){
        System.out.println("oh yeah!!");
        sc.setAvailable(false);
    } else {
        System.out.println("Sorry!! :(");
    }
  }
}
