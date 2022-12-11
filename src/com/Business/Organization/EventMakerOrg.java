/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Organization;

import com.Business.Government.EventMakerDir;
import com.Business.Role.EventMakerRole;
import com.Business.Role.Role;
import java.util.HashSet;


public class EventMakerOrg extends Organization {
    
    EventMakerDir eventMakerList;
    //constructor to add event maker list to Event Maker directory
    public EventMakerOrg()
    {
        super(Organization.Type.EventMaker.getValue());
        eventMakerList= new EventMakerDir();
    }
    
     public void setChangemakerlist(EventMakerDir eventmakerlist) {
        this.eventMakerList = eventmakerlist;
    }
    

    public EventMakerDir getChangemakerlist() {
        return eventMakerList;
    }

   
    //hash map to support event maker role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new EventMakerRole());
       return role;
       
    }
}
