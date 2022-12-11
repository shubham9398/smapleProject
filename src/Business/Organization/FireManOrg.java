/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.FireMan.FireManDir;
import Business.Role.FireManRole;
import Business.Role.Role;
import java.util.HashSet;


public class FireManOrg extends Organization{
    FireManDir fireManList;
    //constructor to add fireman list to fireman directory
    public FireManOrg(String name)
    {
        super(Organization.Type.FireMan.getValue());
        fireManList=new FireManDir();
    }


    public FireManDir getFireManList() {
        return fireManList;
    }

    public void setFireManList(FireManDir fireManList) {
        this.fireManList = fireManList;
    }
    //hasmap to support fire man role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new FireManRole());
       return role;
       
    } 
}
