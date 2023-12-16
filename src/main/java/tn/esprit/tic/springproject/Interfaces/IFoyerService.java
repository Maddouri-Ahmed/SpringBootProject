package tn.esprit.tic.springproject.Interfaces;

import tn.esprit.tic.springproject.Entity.Foyer;

import java.util.List;

public interface IFoyerService {
    List<Foyer> retrieveAllFoyers();

    Foyer addFoyer(Foyer f);

    Foyer updateFoyer(Foyer e);

    Foyer retrieveFoyer(Long idFoyer);

    void removeFoyer(Long idFoyer);
    void archiverFoyer (long idFoyer);
    Foyer addFoyerWithBloc (Foyer foyer);
}

