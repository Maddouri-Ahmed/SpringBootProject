package tn.esprit.tic.springproject.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.springproject.Entity.Bloc;
import tn.esprit.tic.springproject.Entity.Chambre;
import tn.esprit.tic.springproject.Entity.TypeChambre;
import tn.esprit.tic.springproject.Interfaces.IchambreService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("chambre")

public class ChambreController {
    IchambreService chambreService;
    @GetMapping("/chambres-par-nom-bloc/{nomBloc}")
    public List<Chambre> getChambresParNomBloc(@PathVariable String nomBloc) {
        return chambreService.getChambresParNomBloc(nomBloc);
    }
    @GetMapping("/nb-chambres-par-type-et-bloc")
    public long nbChambreParTypeEtBloc(@RequestParam TypeChambre typeChambre, @RequestParam Bloc idBloc) {
        return chambreService.nbChambreParTypeEtBloc(typeChambre, idBloc);
    }

}
