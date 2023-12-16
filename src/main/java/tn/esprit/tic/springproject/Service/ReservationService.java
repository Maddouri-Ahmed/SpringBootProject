package tn.esprit.tic.springproject.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproject.Entity.Reservation;
import tn.esprit.tic.springproject.Interfaces.IReservationService;
import tn.esprit.tic.springproject.Repository.ReservationRepository;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class ReservationService implements IReservationService {
    ReservationRepository reservationRepository;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation retrieveReservation(Long idReservation) {
        return reservationRepository.findById(String.valueOf(idReservation)).get();
    }

    @Override
    public void removeReservation(Long idReservation) {
        reservationRepository.deleteById(String.valueOf(idReservation));
    }
    @Override
    public List<Reservation> getReservationParAnneeUniversitaire(Date anneeUniversitaire) {
        return reservationRepository.findByAnneeUniversitaire(anneeUniversitaire);
    }
}