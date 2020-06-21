package fr.kba.dentalgoure.security.services;

import fr.kba.dentalgoure.models.BoiteIdeeCommentaire;
import fr.kba.dentalgoure.repository.BoiteIdeeCommentaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BoiteIdeeCommentaireServiceImpl implements  BoiteIdeeCommentaireService {

    private  final BoiteIdeeCommentaireRepository boiteIdeeCommentaireRepository;

    @Autowired
    public BoiteIdeeCommentaireServiceImpl(BoiteIdeeCommentaireRepository boiteIdeeCommentaireRepository) {
        this.boiteIdeeCommentaireRepository = boiteIdeeCommentaireRepository;
    }

    @Override
    public List<BoiteIdeeCommentaire> findAll() {
        return boiteIdeeCommentaireRepository.findAll();
    }

    @Override
    public void save(BoiteIdeeCommentaire boiteIdeeCommentaire) {
        boiteIdeeCommentaireRepository.save(boiteIdeeCommentaire);

    }

    @Override
    public Optional<BoiteIdeeCommentaire> findById(Long id) {
        return boiteIdeeCommentaireRepository.findById(id);
    }

    @Override
    public void delete(long id) {
        boiteIdeeCommentaireRepository.deleteById(id);

    }
}
