package com.example.robot.Services.ServImpl;

import com.example.robot.Services.RobotService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class RobotServiceImpl implements RobotService {
    private static final String ROBOT_CPU_URL = "https://robotstakeover20210903110417.azurewebsites.net/robotcpu";

    private final RestTemplate restTemplate;

    public RobotServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Robot> getAllRobots() {
        ResponseEntity<Robot[]> response = restTemplate.getForEntity(ROBOT_CPU_URL, Robot[].class);
        Robot[] robotsArray = response.getBody();
        List<Robot> robots = Arrays.asList(robotsArray);
        return robots;
    }
}
