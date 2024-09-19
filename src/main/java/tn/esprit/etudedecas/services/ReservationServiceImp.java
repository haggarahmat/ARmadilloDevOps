package tn.esprit.etudedecas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.entities.Reservation;
import tn.esprit.etudedecas.repositories.ReservationRepository;

import java.util.List;
@Service

public class ReservationServiceImp implements IReservation{
    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public Reservation addReservation(Reservation R) {
        return reservationRepository.save(R);
    }

    @Override
    public Reservation updateReservation(Reservation R) {
        return reservationRepository.save(R);
    }

    @Override
    public List<Reservation> findAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation findById(String idR) {
        return reservationRepository.findById(idR).orElse(null);
    }

    @Override
    public void deleteReservation(String idR) {
        reservationRepository.deleteById(idR);
    }
    @Override
    public List<Reservation> getReservationsByEtudiantId(long idEtudiant) {
        return reservationRepository.findReservationsByEtudiantId(idEtudiant);
    }    @Override

    public List<Reservation> findReservationsByEtudiantsWithPrefixAB() {
        return reservationRepository.findReservationsByEtudiantsWithPrefixAB();
    }
}
