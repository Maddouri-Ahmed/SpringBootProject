package tn.esprit.tic.springproject.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.springproject.Entity.Universite;
import tn.esprit.tic.springproject.Interfaces.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")

public class UniversiteController {
    IUniversiteService universiteService;

    @GetMapping("/retrieve-all-universities")
    public List<Universite> retrieveAllUniversities() {
        List<Universite> listUniversites = universiteService.retrieveAllUniversite();
        return listUniversites;
    }

    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite universite) {
        universiteService.addUniversite(universite);
        return universiteService.retrieveAllUniversite().get(universiteService.retrieveAllUniversite().size() - 1);
    }

    @PutMapping("/update-universite")
    public Universite updateUniversite(@RequestBody Universite universite) {
        return universiteService.updateUniversite(universite);
    }

    @GetMapping("/retrieve-universite/{idUniversite}")
    public Universite retrieveUniversite(@PathVariable long idUniversite) {
        return universiteService.retrieveUniversite(idUniversite);
    }
    @DeleteMapping("/remove-universite/{idUniversite}")
    public void removeUniversite(@PathVariable long idUniversite) {
        universiteService.removeUniversite(idUniversite);
    }

    @PutMapping("/afficher/{idUniversite}/{idFoyer}")
    @ResponseBody
    public Universite affecterFoyerAUniversite(@PathVariable("idUniversite") String idUniversite,
                                               @PathVariable("idFoyer") long idFoyer)
    {
        Universite universite =universiteService.affecterFoyerAUniversite(idFoyer,idUniversite);
        return universite;
    }
    @PutMapping("/desaffecter/{idUniversite}")
    @ResponseBody
    public Universite desaffecterFoyerAUniversite(@PathVariable("idUniversite") long idUniversite) {
        Universite universite = universiteService.desaffecterFoyerAUniversite(idUniversite);
        return universite;
    }


}
