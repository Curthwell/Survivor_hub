package com.example.robot.Controller;

import com.example.robot.Services.SurvivorService;
import com.example.robot.entity.Survivor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/survivors")
public class SurvivorController {
    private final SurvivorService survivorService;

    @Autowired
    public SurvivorController(SurvivorService survivorService) {
        this.survivorService = survivorService;
    }

    @PostMapping
    public ResponseEntity<Survivor> addSurvivor(@RequestBody Survivor survivor) {
        Survivor savedSurvivor = survivorService.addSurvivor(survivor);
        return new ResponseEntity<>(savedSurvivor, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Survivor>> getAllSurvivors() {
        List<Survivor> survivors = survivorService.getAllSurvivors();
        return new ResponseEntity<>(survivors, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Survivor> getSurvivorById(@PathVariable Long id) {
        Survivor survivor = survivorService.getSurvivorById(id);
        if (survivor != null) {
            return new ResponseEntity<>(survivor, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateSurvivor(@PathVariable Long id, @RequestBody Survivor survivor) {
        Survivor existingSurvivor = survivorService.getSurvivorById(id);
        if (existingSurvivor != null) {
            survivor.setId(id);
            survivorService.updateSurvivor(survivor);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSurvivor(@PathVariable Long id) {
        Survivor existingSurvivor = survivorService.getSurvivorById(id);
        if (existingSurvivor != null) {
            survivorService.deleteSurvivorById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/{id}/reportContamination")
    public ResponseEntity<Void> reportContamination(@PathVariable Long id) {
        survivorService.reportContamination(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/infectedPercentage")
    public ResponseEntity<Double> getInfectedPercentage() {
        double totalSurvivors = survivorService.getAllSurvivors().size();
        double infectedSurvivors = survivorService.getInfectedSurvivors().size();
        double percentage = (infectedSurvivors / totalSurvivors) * 100;
        return new ResponseEntity<>(percentage, HttpStatus.OK);
    }

    @GetMapping("/nonInfectedPercentage")
    public ResponseEntity<Double> getNonInfectedPercentage() {
        double totalSurvivors = survivorService.getAllSurvivors().size();
        double infectedSurvivors = survivorService.getInfectedSurvivors().size();
        double nonInfectedSurvivors = totalSurvivors - infectedSurvivors;
        double percentage = (nonInfectedSurvivors / totalSurvivors) * 100;
        return new ResponseEntity<>(percentage, HttpStatus.OK);
    }
    

}
