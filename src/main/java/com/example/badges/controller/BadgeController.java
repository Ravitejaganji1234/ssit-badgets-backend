package com.example.badges.controller;


import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.web.bind.annotation.*;
  import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.example.badges.model.*;
  import com.example.badges.service.*;



  @RestController

  @CrossOrigin
  @RequestMapping("apis/employees/badges")

public class BadgeController {
    @Autowired 
    public BadgeJpaService badgeService;

    @GetMapping("/badges")
    public ArrayList<Badge> gettTasks(){
        return badgeService.getAllBadges();
    }

    @PostMapping("/AddBadges")
    public void addBadge(@RequestBody Badge badge) {
        badgeService.addBadge(badge);
    }

    @GetMapping("/BadgesAssignedBy/{email}")
    public List<Badge> getBadgesAssignedBy(@PathVariable String email) {
        return badgeService.getBadgesAssignedBy(email);
    }

    @GetMapping("/BadgesAssignedTo/{email}")
    public List<Badge> getBadgesAssignedTo(@PathVariable String email) {
        return badgeService.getBadgesAssignedTo(email);
    }
    
    
}
