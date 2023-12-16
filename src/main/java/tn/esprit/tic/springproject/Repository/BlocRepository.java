package tn.esprit.tic.springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.springproject.Entity.Bloc;
import tn.esprit.tic.springproject.Entity.Universite;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {
    Bloc findByUniversite(Universite universite);
    Bloc findByNomBloc (String nomBloc );

}
