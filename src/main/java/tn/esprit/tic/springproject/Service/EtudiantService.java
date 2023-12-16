package tn.esprit.tic.springproject.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproject.Entity.Etudiant;
import tn.esprit.tic.springproject.Entity.Reservation;
import tn.esprit.tic.springproject.Interfaces.IEtudiantService;
import tn.esprit.tic.springproject.Repository.EtudiantRepository;
import tn.esprit.tic.springproject.Repository.ReservationRepository;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Service
@Slf4j
public class EtudiantService implements IEtudiantService {


    EtudiantRepository etudiantRepository;

    ReservationRepository reservationRepository;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).get();
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);

    }

    @Override
    public Etudiant affecterEtudiantAReservation(String nomEt, String prenomEt, String idReservation) {
        Etudiant etudiant = etudiantRepository.findByNomEtAndPrenomEt(nomEt, prenomEt);
        Reservation reservation = reservationRepository.findById(idReservation).orElse(null);

        if (etudiant != null && reservation != null) {
            reservation.setEtudiant(etudiant);

            reservationRepository.save(reservation);

            return etudiant;
        } else {
            throw new EtudiantOrReservationNotFoundException("Etudiant or Reservation not found");
        }
    }
}
