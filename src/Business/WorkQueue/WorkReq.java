/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.EventMaker.EventMaker;
import Business.FireMan.FireMan;
import Business.NGO.NGO;
import Business.Police.Police;
import Business.Provider.Item;
import Business.Provider.Supplier;
import Business.UserAccount.UserAccount;
import Business.Victim.Victim;
import Business.Volunteer.Volunteer;
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

    public FireMan getFireman() {
        return fireman;
    }

    public void setFireman(FireMan fireman) {
        this.fireman = fireman;
    }


    
    public WorkReq(){
        requestDate = new Date();
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

   

    @Override
    public String toString(){
        return status;
    }
}

