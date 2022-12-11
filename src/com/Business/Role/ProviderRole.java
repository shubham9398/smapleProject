/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Role;

import com.Business.Ecosystem;
import com.Business.Enterprise.Enterprise;
import com.Business.Organization.Organization;
import com.Business.Organization.ProviderOrg;
import com.Business.UserAccount.UserAccount;
import com.UI.Supplier.SupplierDashboard;
import javax.swing.JPanel;


public class ProviderRole extends Role{
    //overriding main panel with provider work area whenever provider role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system){
        return new SupplierDashboard(userProcessContainer,account,(ProviderOrg)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.ProviderRole.getValue();
}


}
