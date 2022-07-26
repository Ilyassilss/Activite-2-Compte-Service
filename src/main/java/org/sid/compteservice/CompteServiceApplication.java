package org.sid.compteservice;

import org.sid.compteservice.entities.Compte;
import org.sid.compteservice.enums.TypeCompte;
import org.sid.compteservice.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class CompteServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompteServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CompteRepository repository , RepositoryRestConfiguration restConfiguration){
        return args -> {
            restConfiguration.exposeIdsFor(Compte.class);
            repository.save(new Compte(null,Math.random()*999,new Date() , TypeCompte.COURANT));
            repository.save(new Compte(null,Math.random()*999,new Date() , TypeCompte.EPARGNE));
            repository.save(new Compte(null,Math.random()*999,new Date() , TypeCompte.COURANT));

            repository.findAll().forEach(cp ->{
                System.out.println(cp.getType());
                System.out.println(cp.getSolde());
            });
        };
    }
}
