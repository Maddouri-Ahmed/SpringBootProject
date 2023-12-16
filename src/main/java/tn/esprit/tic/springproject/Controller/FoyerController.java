package tn.esprit.tic.springproject.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.springproject.Entity.Foyer;
import tn.esprit.tic.springproject.Interfaces.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerController {
    IFoyerService foyerService;

    @GetMapping("/retrieve-all-foyer")
    public List<Foyer> getFoyer() {
        List<Foyer> listFoyers = foyerService.retrieveAllFoyers();
        return listFoyers;
    }
    @PostMapping("/foyer/add-etudiant")
    public List<Foyer> addEtudiantToFoyer(@RequestBody Foyer foyer) {
        foyerService.addFoyer(foyer);
        return foyerService.retrieveAllFoyers();
    }

    @PutMapping("/update-foyer")
    public Foyer updateFoyer(@RequestBody Foyer foyer) {
        return foyerService.updateFoyer(foyer);
    }

    @GetMapping("/retrieve-foyer/{idFoyer}")
    public Foyer retrieveFoyer(@PathVariable long idFoyer) {
        return foyerService.retrieveFoyer(idFoyer);
    }

    @DeleteMapping("/remove-foyer/{idFoyer}")
    public void removeEtudiant(@PathVariable long idFoyer) {
        foyerService.removeFoyer(idFoyer);
    }
    @PostMapping("/add-foyer")
    public List<Foyer> addFoyer(@RequestBody Foyer foyer) {
        foyerService.addFoyer(foyer);
        return foyerService.retrieveAllFoyers();
    }
    @PostMapping("/add-foyer-with-bloc")
    public List<Foyer> addFoyerWithBloc(@RequestBody Foyer foyer) {
        foyerService.addFoyerWithBloc(foyer);
        return foyerService.retrieveAllFoyers();
    }


}