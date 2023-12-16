package tn.esprit.tic.springproject.Controller;

import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.springproject.Entity.Reservation;
import tn.esprit.tic.springproject.Interfaces.IReservationService;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Reservation")
public class ReservationController {
    IReservationService reservationService;

    @GetMapping("/retrieve-all-reservation")
    public List<Reservation> getReservation() {
        List<Reservation> listReservation = reservationService.retrieveAllReservation();
        return listReservation;
    }
    @PostMapping("/add-reservation")
    public List<Reservation> addReservation(@RequestBody Reservation reservation) {
        reservationService.addReservation(reservation);
        return reservationService.retrieveAllReservation();
    }

    @PutMapping("/update-reservation")
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

    @GetMapping("/retrieve-reservation/{idReservation}")
    public Reservation retrieveReservation(@PathVariable long idReservation) {
        return reservationService.retrieveReservation(idReservation);
    }

    @DeleteMapping("/remove-reservation/{idReservation}")
    public void removeReservation(@PathVariable long idReservation) {
        reservationService.removeReservation(idReservation);
    }
    @GetMapping("/reservations-par-annee-universitaire")
    public List<Reservation> getReservationParAnneeUniversitaire(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date anneeUniversitaire) {
        return reservationService.getReservationParAnneeUniversitaire(anneeUniversitaire);
    }

}

