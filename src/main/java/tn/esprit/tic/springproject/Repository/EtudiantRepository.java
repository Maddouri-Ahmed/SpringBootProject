package tn.esprit.tic.springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.springproject.Entity.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

    Etudiant findByNomEtAndPrenomEt(String nomEt, String prenomEt);
}
