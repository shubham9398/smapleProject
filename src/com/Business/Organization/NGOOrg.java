/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Organization;

import com.Business.Contractor.NGODir;
import com.Business.Role.NGOManagerRole;
import com.Business.Role.Role;
import java.util.HashSet;


public class NGOOrg extends Organization{
    NGODir ngoList;
    //constructor to add NGO list to NGO directory
    public NGOOrg()
    {
        super(Organization.Type.NGO.getValue());
        ngoList=new NGODir();
    }

    

    public void setNgoList(NGODir ngoList) {
        this.ngoList = ngoList;
    }
    
    public NGODir getNgoList() {
        return ngoList;
    }
    //hashmap to support NGO role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new NGOManagerRole());
       return role;
       
    }
}
