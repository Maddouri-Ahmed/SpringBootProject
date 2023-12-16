package tn.esprit.tic.springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.springproject.Entity.Bloc;
import tn.esprit.tic.springproject.Entity.Chambre;
import tn.esprit.tic.springproject.Entity.TypeChambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    Chambre findAllByNumeroChambre (Long numChambres);

    public List<Chambre> findByBlocNomBloc(String nomBloc );

    public long countByTypeChambreAndBloc(TypeChambre typeChambre, Bloc bloc);

}
