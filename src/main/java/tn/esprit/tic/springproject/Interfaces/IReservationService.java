package tn.esprit.tic.springproject.Interfaces;

import tn.esprit.tic.springproject.Entity.Reservation;

import java.util.Date;
import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservation();

    Reservation addReservation(Reservation r);

    Reservation updateReservation(Reservation r);

    Reservation retrieveReservation(Long idReservation);

    void removeReservation(Long idReservation);

    List<Reservation> getReservationParAnneeUniversitaire(Date anneeUniversitaire);

}
