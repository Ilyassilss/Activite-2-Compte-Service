package org.sid.compteservice.services;

public interface CompteService {
    void virement(Long codeSource , Long codeDestination , double montant );
}
