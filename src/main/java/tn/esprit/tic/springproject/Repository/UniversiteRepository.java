package tn.esprit.tic.springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.springproject.Entity.Universite;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {

    Universite findByNomUniversite(String nomUniversite);

}
