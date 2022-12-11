/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.EventMakerAdminRole;
import Business.Role.Role;
import Business.Role.VolunteerAdminRole;
import java.util.HashSet;
import Business.Role.VictimAdminRole;


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
