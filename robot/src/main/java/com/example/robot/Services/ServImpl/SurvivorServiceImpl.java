package com.example.robot.Services.ServImpl;

import com.example.robot.Services.SurvivorService;
import com.example.robot.entity.Survivor;
import com.example.robot.repository.SurvivorRepo;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class SurvivorServiceImpl implements SurvivorService {

    private final SurvivorRepo survivorRepository;

    public SurvivorServiceImpl(SurvivorRepo survivorRepository) {
        this.survivorRepository = survivorRepository;
    }

    @Override
    public Survivor addSurvivor(Survivor survivor) {
        return survivorRepository.save(survivor);
    }
//we do not pass parameter is we are finding all
    @Override
    public List<Survivor> getAllSurvivors() {
        return survivorRepository.findAll();
    }

    @Override
    public Survivor getSurvivorById(Long id) {
        Optional<Survivor> optionalSurvivor = survivorRepository.findById(id);
        return optionalSurvivor.orElse(null);
    }

    @Override
    public void updateSurvivor(Survivor survivor)
    {
        survivorRepository.save(survivor);
    }

    @Override
    public void deleteSurvivorById(Long id) {
        survivorRepository.deleteById(id);

    }

    @Override
    public void reportContamination(Long survivorId) {

    }

    @Override
    public Collection<Object> getInfectedSurvivors() {
        return null;
    }
}
