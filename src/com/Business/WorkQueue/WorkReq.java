/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.WorkQueue;

import com.Business.Government.EventMaker;
import com.Business.FireMan.FireMan;
import com.Business.Contractor.NGO;
import com.Business.Police.Police;
import com.Business.Supplier.Item;
import com.Business.Supplier.Supplier;
import com.Business.UserAccount.UserAccount;
import com.Business.Volunteer.Victim;
import com.Business.Worker.Volunteer;
import java.util.ArrayList;
import java.util.Date;


public abstract class WorkReq {
    private String subject;
    private UserAccount sender;
    private UserAccount reciever;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private EventMaker eventMaker;
    private Victim changeSeeker;
    private NGO ngo;
    private Supplier provider;
    private Item item;
    private Volunteer volunteer;
    private Police police;
    private FireMan fireman;
    private ArrayList<String> statusList; 

    
    
    public FireMan getFireman() {
        return fireman;
    }

    public void setFireman(FireMan fireman) {
        this.fireman = fireman;
    }


    
    public WorkReq(){
        requestDate = new Date();
        this.statusList = new ArrayList<>();
    }
    
    public Police getPolice() {
        return police;
    }

    public void setPolice(Police police) {
        this.police = police;
    }

   

    
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
     


    
    public String getSubject() {
        return subject;
    }
    
     public Volunteer getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public UserAccount getSender() {
        return sender;
    }
    
    
     public NGO getNgo() {
        return ngo;
    }

    public void setNgo(NGO ngo) {
        this.ngo = ngo;
    }

    

    public void setReciever(UserAccount reciever) {
        this.reciever = reciever;
    }

    public String getStatus() {
        return status;
    }

    public Supplier getProvider() {
        return provider;
    }

    public void setProvider(Supplier provider) {
        this.provider = provider;
    }

    
    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }
    
    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReciever() {
        return reciever;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    

    public EventMaker getEventMaker() {
        return eventMaker;
    }

    public void setEventMaker(EventMaker eventMaker) {
        this.eventMaker = eventMaker;
    }

    public Victim getChangeSeeker() {
        return changeSeeker;
    }

    public void setChangeSeeker(Victim changeSeeker) {
        this.changeSeeker = changeSeeker;
    }
    
    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

   
    public ArrayList<String> getStatusList() {
        return statusList;
    }

    public void setStatusList(ArrayList<String> statusList) {
        this.statusList = statusList;
    }

    @Override
    public String toString(){
        return status;
    }
}

