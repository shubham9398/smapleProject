/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Volunteer;

import java.util.ArrayList;

//victim
public class VictimDir {
    private ArrayList<Victim> changeSeekerDir;

    public VictimDir() {
        changeSeekerDir=new ArrayList<>();
        
    }

   
   
    public Victim addChangeSeeker(){
        Victim cs= new Victim();
        changeSeekerDir.add(cs);
        return cs;
    }
    
    
     public ArrayList<Victim> getChangeSeekerDir() {
        return changeSeekerDir;
    }

    public void setChangeSeekerDir(ArrayList<Victim> changeSeekerDir) {
        this.changeSeekerDir = changeSeekerDir;
    }
  
    public void removeChangeSeeker(Victim cs){
        changeSeekerDir.remove(cs);
    }
    
}
