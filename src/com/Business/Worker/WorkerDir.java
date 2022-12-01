/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Worker;

import java.util.ArrayList;


public class VolunteerDir {
    private ArrayList<Volunteer> volunteerList;

    public VolunteerDir() {
        volunteerList= new ArrayList<>();
        
    }
    
    
     public void setVolunteerList(ArrayList<Volunteer> volunteerList) {
        this.volunteerList = volunteerList;
    }
 
     
     //add vulunteer functon 
    public Volunteer addVolunteer(){
    
        Volunteer v = new Volunteer();
        volunteerList.add(v);
        return v;
    }

    
    //get voluteer list
    public ArrayList<Volunteer> getVolunteerList() {
        return volunteerList;
    }

   // remove volunteer form the list
  
    public void removeVolunteer(Volunteer v){
        volunteerList.remove(v);
    }
}
