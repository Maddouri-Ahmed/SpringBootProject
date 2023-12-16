package tn.esprit.tic.springproject.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.springproject.Entity.Bloc;
import tn.esprit.tic.springproject.Service.BlocService;

@RestController
@AllArgsConstructor
@RequestMapping("bloc")
public class BlocController {
    BlocService blocService;
    @GetMapping("/retrieve-all-blocs")
    public Bloc retrieveAllBlocs() {
        Bloc bloc = blocService.retrieveAllBloc();
        return bloc;
    }


    @PutMapping("/affecter-chambres/{numChambre}/{nomBloc}")
    public Bloc affecterChambresABloc(@PathVariable("numChambre") Long numChambre,
                                      @PathVariable("nomBloc") String nomBloc) {
        return blocService.affecterChambresABloc(numChambre, nomBloc);
    }
}
