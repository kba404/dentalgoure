package fr.kba.dentalgoure.controllers;
import fr.kba.dentalgoure.models.BoiteIdee;
import fr.kba.dentalgoure.security.services.BoiteIdeeServiceImpl;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1")
public class BoiteIdeeController {

    private final BoiteIdeeServiceImpl boiteIdeeServiceImpl;

    @Autowired
    public BoiteIdeeController(BoiteIdeeServiceImpl boiteIdeeServiceImpl) {
        this.boiteIdeeServiceImpl = boiteIdeeServiceImpl;
    }

    @RequestMapping(value = "/boiteIdee", method = RequestMethod.GET)
    @ResponseBody
    List<BoiteIdee> getAllBoiteIdee() {
        return this.boiteIdeeServiceImpl.findAll();
    }

    @RequestMapping(value = "/boiteIdee/{id}", method = RequestMethod.GET)
    @ResponseBody
    Optional<BoiteIdee> getBoiteIdeeById(@PathVariable final Long id) {
        return this.boiteIdeeServiceImpl.findById(id);
    }

    @RequestMapping(value = "/boiteIdee", method = RequestMethod.POST)
    void addBoiteIdee(@RequestBody BoiteIdee boiteIdee){
        this.boiteIdeeServiceImpl.save(boiteIdee);
    }

    @RequestMapping(value = "/boiteIdee/{id}", method = RequestMethod.DELETE)
    void deleteBoiteIdee(@PathVariable final Long id){
        this.boiteIdeeServiceImpl.delete(id);
    }
}
