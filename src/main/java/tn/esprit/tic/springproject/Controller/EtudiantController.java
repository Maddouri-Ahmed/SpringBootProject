package tn.esprit.tic.springproject.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.springproject.Entity.Etudiant;
import tn.esprit.tic.springproject.Interfaces.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {
    IEtudiantService etudiantService;

    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiant() {
        List<Etudiant> listEtudiants = etudiantService.retrieveAllEtudiants();
        return listEtudiants;
    }

    @PostMapping("/add-etudiant")
    public List<Etudiant> addEtudiant(@RequestBody Etudiant etudiant) {
        etudiantService.addEtudiant(etudiant);
        return etudiantService.retrieveAllEtudiants();
    }

    @PutMapping("/update-etudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.updateEtudiant(etudiant);
    }

    @GetMapping("/retrieve-etudiant/{idEtudiant}")
    public Etudiant retrieveEtudiant(@PathVariable long idEtudiant) {
        return etudiantService.retrieveEtudiant(idEtudiant);
    }
}
