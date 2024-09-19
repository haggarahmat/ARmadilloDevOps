package tn.esprit.etudedecas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudedecas.entities.Reservation;
import tn.esprit.etudedecas.services.ReservationServiceImp;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reservation")

public class ReservationController {
    @Autowired
    private ReservationServiceImp reservationServiceImp;
    @PostMapping("/add")
    public Reservation addFoyer(@RequestBody Reservation f) {
        return  reservationServiceImp.addReservation(f);
    }
    @PutMapping("/update")
    public Reservation updateFoyer(@RequestBody Reservation f) {
        return  reservationServiceImp.updateReservation(f);
    }
    @GetMapping("/getall")
    public List<Reservation> findAllFoyer() {
        return  reservationServiceImp.findAllReservation();
    }
    @GetMapping("/get/{idF}")

    public Reservation findById(@PathVariable String idF) {
        return  reservationServiceImp.findById(idF);
    }
    @DeleteMapping("/delete/{idF}")

    public void deleteFoyer(@PathVariable String idF) {
        reservationServiceImp.deleteReservation(idF);
    }

    @GetMapping("/etudiant/{etudiantId}")
    public ResponseEntity<List<Reservation>> getReservationsByEtudiantId(@PathVariable long etudiantId) {
        List<Reservation> reservations = reservationServiceImp.getReservationsByEtudiantId(etudiantId);
        return ResponseEntity.of(Optional.ofNullable(reservations));

    }
    @GetMapping("/AB")
    public ResponseEntity<List<Reservation>> getReservationsForStudentsWithPrefixAB() {
        List<Reservation> reservations = reservationServiceImp.findReservationsByEtudiantsWithPrefixAB();
        return ResponseEntity.of(Optional.ofNullable(reservations));
    }
}
