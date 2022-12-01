/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.RoadSafety;

import java.util.ArrayList;


public class HospitalDir {
    private ArrayList<Hospital> hospitalDir;
    
    
    //new hospital diretory
    public HospitalDir() {
    hospitalDir= new ArrayList();
    }

    public ArrayList<Hospital> getHospitalDir() {
        return hospitalDir;
    }

    
    //add a new doctor
    public Hospital addHospital(){
        Hospital h =new Hospital();
        hospitalDir.add(h);
        return h;
    }
    
    public void setHospitalDir(ArrayList<Hospital> hospitalDir) {
        this.hospitalDir = hospitalDir;
    }
    //remove a doctor
    public void removeHospital(Hospital hospital){
        hospitalDir.remove(hospital);   
    }
    
}
