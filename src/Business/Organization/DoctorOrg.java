/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Hospital.HospitalDir;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.HashSet;

//Doctor Oraganization 
public class DoctorOrg extends Organization{
    HospitalDir doctorList;
    //constructor to add doctor list to hospital directory
    public DoctorOrg()
    {
        super(Organization.Type.Doctor.getValue());
        doctorList= new HospitalDir();
    }

    public HospitalDir getHospitallist() {
        return doctorList;
    }
    
    //setHospital List

    public void setHospitallist(HospitalDir doctorList) {
        this.doctorList = doctorList;
    }
    
    //hashmap to support doctor role
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new DoctorRole());
       return role;
    }
    
}
