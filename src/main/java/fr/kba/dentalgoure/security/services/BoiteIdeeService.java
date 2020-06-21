package fr.kba.dentalgoure.security.services;

import fr.kba.dentalgoure.models.BoiteIdee;

import java.util.List;
import java.util.Optional;

public interface BoiteIdeeService {

    List < BoiteIdee > findAll();

    void save(BoiteIdee boiteIdee);

    Optional< BoiteIdee > findById(Long id);

    void delete(long id);
}
