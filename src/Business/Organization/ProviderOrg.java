/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Provider.SupplierDir;
import Business.Role.ProviderRole;
import Business.Role.Role;
import java.util.HashSet;


public class ProviderOrg extends Organization{
    SupplierDir providerList;
    //constructor to add provider list to provider directory
    public ProviderOrg(String name) {
        super(Organization.Type.Provider.getValue());
        providerList= new SupplierDir();
      
    }
       public void setProviderList(SupplierDir providerList) {
        this.providerList = providerList;
    }
       
       //GetProviderList

    public SupplierDir getProviderList() {
        return providerList;
    }

 
    //hashmap to support provider list
    @Override
    public HashSet<Role> getSupportedRole(){
       
        role.add(new ProviderRole());
        return role;
    }
}
