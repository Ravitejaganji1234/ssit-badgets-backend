package com.example.badges.model;
import jakarta.persistence.*;
import java.util.*;


@Entity 

public class Badge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="badgeId")
    int badgeId;

    @Column(name="assignedPersonEmail")
    String assignedPersonEmail;

    @Column(name="personName")
    String personName;

    @Column(name="personEmail")
    String personEmail;

    @Column (name="badgeName")
    String badgeName;

    @Column (name="comments")
    String comments;

    public Badge(){}


    public Badge(int badgeId, String assignedPersonEmail, String personName, String personEmail, String badgeName, String comments){
        this.badgeId=badgeId;
        this.assignedPersonEmail=assignedPersonEmail;
        this.personName=personName;
        this.personEmail=personEmail;
        this.badgeName=badgeName;
        this.comments=comments;
    }

    public int getBadgeId(){
        return badgeId;
    }

    public void setBadgeId(int badgeId){
        this.badgeId=badgeId;
    }

    public String getAssignedPersonEmail(){
        return assignedPersonEmail;
    }

    public void setAssignedPersonEmail(String assignedPersonEmail){
        this.assignedPersonEmail=assignedPersonEmail;
    }

    public String getPersonName(){
        return personName;
    }

    public void setPersonName(String personName){
        this.personName=personName;
    }

    public String getPersonEmail(){
        return personEmail;
    }

    public void setPersonEmail(String personEmail){
        this.personEmail=personEmail;
    }

    public String getBadgeName(){
        return badgeName;
    }

    public void setBadgeName(String badgeName){
        this.badgeName=badgeName;
    }

    public String getComments(){
        return comments;
    }

    public void setComments(String comments){
        this.comments=comments;
    }
    
}
