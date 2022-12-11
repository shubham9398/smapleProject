/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.VolunteerRole;
import Business.Volunteer.VolunteerDir;
import java.util.HashSet;


public class VolunteerOrg extends Organization{
    VolunteerDir volunteerList;
    //constructor to add volunteer list to volunteer directory
    public VolunteerOrg(String name) {
        super(Organization.Type.Volunteer.getValue());
        volunteerList= new VolunteerDir();
    }
    
    //set voulnteerList
     public void setVolunteerList(VolunteerDir volunteerList) {
        this.volunteerList = volunteerList;
    }

    public VolunteerDir getVolunteerList() {
        return volunteerList;
    }

   
    //hashmap to support volunteer role
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new VolunteerRole());
       return role;
    }
}
