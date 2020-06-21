package fr.kba.dentalgoure.controllers;

import fr.kba.dentalgoure.models.BoiteIdeeCommentaire;
import fr.kba.dentalgoure.security.services.BoiteIdeeCommentaireServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1")
public class BoiteIdeeCommentaireController {

    private final BoiteIdeeCommentaireServiceImpl boiteIdeeCommentaireServiceImpl;

    @Autowired
    public BoiteIdeeCommentaireController(BoiteIdeeCommentaireServiceImpl boiteIdeeCommentaireServiceImpl) {
        this.boiteIdeeCommentaireServiceImpl = boiteIdeeCommentaireServiceImpl;
    }

    @RequestMapping(value = "/noiteIdeeCommentaire", method = RequestMethod.GET)
    @ResponseBody
    List<BoiteIdeeCommentaire> getAllBoiteIdee() {
        return this.boiteIdeeCommentaireServiceImpl.findAll();
    }

    @RequestMapping(value = "/boiteIdeeCommentaire/{id}", method = RequestMethod.GET)
    @ResponseBody
    Optional<BoiteIdeeCommentaire> getBoiteIdeeCommentaireById(@PathVariable final Long id) {
        return this.boiteIdeeCommentaireServiceImpl.findById(id);
    }

    @RequestMapping(value = "/boiteIdeeCommentaire", method = RequestMethod.POST)
    void addBoiteIdeeCommentaire(@RequestBody BoiteIdeeCommentaire boiteIdeeCommentaire){
        this.boiteIdeeCommentaireServiceImpl.save(boiteIdeeCommentaire);
    }

    @RequestMapping(value = "/boiteIdeeCommentaire/{id}", method = RequestMethod.DELETE)
    void deleteBoiteIdeeCommentaire(@PathVariable final Long id){
        this.boiteIdeeCommentaireServiceImpl.delete(id);
    }

}
