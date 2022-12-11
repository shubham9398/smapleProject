/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Organization;

import com.Business.Role.Role;
import com.Business.Role.VictimRole;
import com.Business.Volunteer.VictimDir;
import java.util.HashSet;


public class VictimOrg extends Organization{
    VictimDir victimList;
    
    public VictimOrg()
    {
        super(Organization.Type.Victim.getValue());
        victimList=new VictimDir();
    }

    
//set changeseeker list
    public void setChangeseekerlist(VictimDir victimList) {
        this.victimList = victimList;
    }
    
    
    public VictimDir getChangeseekerlist() {
        return victimList;
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new VictimRole());
        return role;
        
    }
}