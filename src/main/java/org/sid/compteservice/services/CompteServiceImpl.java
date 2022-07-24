package org.sid.compteservice.services;

import org.sid.compteservice.entities.Compte;
import org.sid.compteservice.repositories.CompteRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CompteServiceImpl implements CompteService {
    private CompteRepository repository ;

    public CompteServiceImpl(CompteRepository repository) {
        this.repository = repository;
    }

    @Override
    public void virement(Long codeSource, Long codeDestination, double montant) {
        Compte c1 = repository.getById(codeSource);
        Compte c2 = repository.getById(codeDestination);
        c1.setSolde(c1.getSolde()-montant);
        c2.setSolde(c2.getSolde()+montant);
        repository.save(c1);
        repository.save(c2);
    }
}
