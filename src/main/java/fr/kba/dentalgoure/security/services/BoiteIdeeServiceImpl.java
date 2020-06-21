package fr.kba.dentalgoure.security.services;

import fr.kba.dentalgoure.models.BoiteIdee;
import fr.kba.dentalgoure.repository.BoiteIdeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BoiteIdeeServiceImpl implements BoiteIdeeService{

    private final BoiteIdeeRepository boiteIdeeRepository;

    @Autowired
    public BoiteIdeeServiceImpl(BoiteIdeeRepository boiteIdeeRepository) {
        this.boiteIdeeRepository = boiteIdeeRepository;
    }

    @Override
    public List<BoiteIdee> findAll() {
        return boiteIdeeRepository.findAll();
    }

    @Override
    public void save(BoiteIdee boiteIdee) {
        boiteIdeeRepository.save(boiteIdee);

    }

    @Override
    public Optional<BoiteIdee> findById(Long id) {
        return boiteIdeeRepository.findById(id);
    }

    @Override
    public void delete(long id) {
        boiteIdeeRepository.deleteById(id);

    }
}
