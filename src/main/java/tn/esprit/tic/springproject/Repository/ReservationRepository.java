package tn.esprit.tic.springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.springproject.Entity.Reservation;

import java.util.Date;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,String> {

    List<Reservation> findByAnneeUniversitaire(Date dateDebut);


}
