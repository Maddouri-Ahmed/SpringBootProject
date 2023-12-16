package tn.esprit.tic.springproject.Interfaces;

import tn.esprit.tic.springproject.Entity.Bloc;

public interface IBlocService {
    Bloc retrieveAllBloc();

    Bloc addBloc(Bloc b);

    Bloc updateBloc(Bloc b);

    Bloc retrieveBloc(Long idBloc);

    void removeBloc(Long idBloc);
    public Bloc affecterChambresABloc(Long numChambre, String nomBloc) ;
    void listeChambresParBloc();

}
