package com.example.badges.service;
import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.http.HttpStatus;
  import org.springframework.stereotype.Service;
  import org.springframework.web.server.ResponseStatusException;
  import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
  import java.util.*;
  import com.example.badges.model.*;
  import com.example.badges.repository.*;

  @Service 

public class BadgeJpaService implements BadgeRepository{

    @Autowired 
    public BadgeJpaRepository badgeRepository;
    @Autowired
    private JavaMailSender emailSender;
    
    

    @Override
    public void addBadge(Badge badge){
        badgeRepository.save(badge);

        String text="Dear "+badge.getPersonName()+"\n Please open My badges in employee portal to view badge details";

      SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(badge.getPersonEmail());
        message.setSubject("New badge");
        message.setText(text);
        emailSender.send(message);

    }

    @Override
    public ArrayList<Badge> getAllBadges(){
       return (ArrayList<Badge>) badgeRepository.findAll();
    }
    
    @Override 
    public List<Badge> getBadgesAssignedBy(String email){
        return badgeRepository.findAllByAssignedPersonEmail(email);
    }

    @Override
    public List<Badge> getBadgesAssignedTo(String email){
        return badgeRepository.findAllByPersonEmail(email);
    }
}
