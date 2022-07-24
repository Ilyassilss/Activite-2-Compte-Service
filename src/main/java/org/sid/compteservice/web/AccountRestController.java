package org.sid.compteservice.web;

import org.sid.compteservice.dtos.VirementRequestDTO;
import org.sid.compteservice.services.CompteService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestController {
    private CompteService compteService ;

    public AccountRestController(CompteService compteService) {
        this.compteService = compteService;
    }

    @PutMapping(path = "comptes/virement")
    public void virement(@RequestBody VirementRequestDTO virementRequestDTO){
         compteService.virement(
                 virementRequestDTO.getCodeSource(),
                 virementRequestDTO.getCodeDestination(),
                 virementRequestDTO.getMontant()
         );
    }
}
