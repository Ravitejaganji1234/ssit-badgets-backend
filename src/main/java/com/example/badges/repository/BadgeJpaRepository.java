package com.example.badges.repository;
import com.example.badges.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
 import java.util.*;
import java.util.List;

public interface BadgeJpaRepository extends JpaRepository<Badge,Integer> {
    List <Badge> findAllByAssignedPersonEmail(String assignedPersonEmail);

    List <Badge> findAllByPersonEmail(String PersonEmail);
}
