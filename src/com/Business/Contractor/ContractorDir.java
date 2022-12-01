/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Contractor;

import java.util.ArrayList;


public class NGODir {
    private ArrayList<NGO> ngoDirectory;

    public NGODir() {
    ngoDirectory= new ArrayList<>();
    }
    
    //get NGO directory

    public ArrayList<NGO> getNgoDirectory() {
        return ngoDirectory;
    }

    public void setNgoDirectory(ArrayList<NGO> ngoDirectory) {
        this.ngoDirectory = ngoDirectory;
    }
    //add a NGO
    
    //remove a NGO
    public void removeNGO(NGO ngo){
        ngoDirectory.remove(ngo);   
    }
    
    public NGO addNGO(){
        NGO ngo =new NGO();
        ngoDirectory.add(ngo);
        return ngo;
    }
}
