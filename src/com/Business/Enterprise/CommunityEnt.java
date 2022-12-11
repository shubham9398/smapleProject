/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Enterprise;

import com.Business.Role.EventMakerAdminRole;
import com.Business.Role.Role;
import com.Business.Role.VolunteerAdminRole;
import java.util.HashSet;
import com.Business.Role.VictimAdminRole;


public class CommunityEnt extends Enterprise{
    public CommunityEnt(String name){
        super(name,Enterprise.EnterpriseType.Community);
    }
    //Hash map to add new roles , which eliminate duplicated role creations
    @Override
    public HashSet<Role> getSupportedRole(){
       
        
              
        role.add(new VictimAdminRole());
        
        role.add(new VolunteerAdminRole());
        
        role.add(new EventMakerAdminRole());
       
        return role;
        
    }
}
