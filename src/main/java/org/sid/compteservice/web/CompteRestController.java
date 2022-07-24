package org.sid.compteservice.web;

import org.sid.compteservice.entities.Compte;
import org.sid.compteservice.repositories.CompteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//  @RestController
public class CompteRestController {
    private CompteRepository repository;

    public CompteRestController(CompteRepository repository) {
        this.repository = repository;
    }

    @GetMapping(path="/comptes")
    public List<Compte> listComptes(){
        return repository.findAll();
    }

    @GetMapping(path="/comptes/{id}")
    public Compte getCompte(@PathVariable Long id){
        return repository.findById(id).get();
    }

    @PostMapping(path = "/comptes")
    public Compte save(@RequestBody Compte compte){
        return repository.save(compte);
    }

    @PutMapping(path = "/comptes/{code}")
    public Compte update(@RequestBody Compte compte , @PathVariable Long code ){
        compte.setCode(code);
        return repository.save(compte);
    }

    @DeleteMapping(path = "/comptes/{id}")
    public void save(@PathVariable Long id){
        repository.deleteById(id);
    }
}
