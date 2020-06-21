package fr.kba.dentalgoure.security.services;

import fr.kba.dentalgoure.models.BoiteIdeeCommentaire;

import java.util.List;
import java.util.Optional;

public interface BoiteIdeeCommentaireService {

    List<BoiteIdeeCommentaire> findAll();

    void save(BoiteIdeeCommentaire boiteIdeeCommentaire);

    Optional<BoiteIdeeCommentaire> findById(Long id);

    void delete(long id);
}
