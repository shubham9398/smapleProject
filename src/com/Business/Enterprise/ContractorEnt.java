/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Enterprise;

import com.Business.Role.NGOManagerRole;
import com.Business.Role.Role;
import java.util.HashSet;

//NGO enterprise
public class ContractorEnt extends Enterprise {
    public ContractorEnt(String name){
        super(name,Enterprise.EnterpriseType.NGO);
    }
    //hash map to for NGO role addition
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new NGOManagerRole());
        return role;
    }
}
