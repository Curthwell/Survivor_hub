package com.example.robot.repository;

import com.example.robot.entity.Survivor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurvivorRepo extends JpaRepository <Survivor,Long> {

}
