package tn.esprit.tic.springproject.Interfaces;

import tn.esprit.tic.springproject.Entity.Bloc;
import tn.esprit.tic.springproject.Entity.Chambre;
import tn.esprit.tic.springproject.Entity.TypeChambre;

import java.util.List;

public interface IchambreService {
    List<Chambre> retrieveAllChambre();

    Chambre addChambre(Chambre ch);

    Chambre updateChambre(Chambre ch);

    Chambre retrieveChambre(Long idChambre);

    void removeChambre(Long idChambre);
    public List<Chambre> getChambresParNomBloc(String nomBloc );
    public long nbChambreParTypeEtBloc(TypeChambre type, Bloc idBloc );

    void pourcentageChambreParTypeChambre();

}
