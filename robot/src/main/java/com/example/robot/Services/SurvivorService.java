package com.example.robot.Services;

import com.example.robot.entity.Survivor;

import java.util.Collection;
import java.util.List;

public interface SurvivorService {


        Survivor addSurvivor(Survivor survivor);

        List<Survivor> getAllSurvivors();

        Survivor getSurvivorById(Long id);

        void updateSurvivor(Survivor survivor);

        void deleteSurvivorById(Long id);
        void reportContamination(Long survivorId);

    Collection<Object> getInfectedSurvivors();
}
