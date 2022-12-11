/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

//configure a system using Ecosystem 
public class ConfigureASystem {
    public static Ecosystem configure(){
        
        //create an instance of Ecosystem 
    Ecosystem system= Ecosystem.getInstance();
   
     Employee employee= system.getEmployeeDir().createEmployee("SYSTEM ADMIN");
     //added userAccounts
     UserAccount ua= system.getUserAccountDir().createUserAccount("admin","admin", employee, new SystemAdminRole());
    
    return system;
    }
}



