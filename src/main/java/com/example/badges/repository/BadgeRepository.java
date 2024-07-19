package com.example.badges.repository;
import java.util.*;
import com.example.badges.model.*;

public interface BadgeRepository {
    ArrayList <Badge> getAllBadges();
    void addBadge(Badge badge);
    List <Badge> getBadgesAssignedBy(String email);
    List <Badge> getBadgesAssignedTo(String Email);
}
