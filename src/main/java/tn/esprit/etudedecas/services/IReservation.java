package tn.esprit.etudedecas.services;

import tn.esprit.etudedecas.entities.Reservation;

import java.util.List;

public interface IReservation {
    public Reservation addReservation(Reservation R);
    public Reservation updateReservation(Reservation R);
    public List<Reservation> findAllReservation();
    public Reservation findById(String idR);
    public void deleteReservation(String idR);
    public List<Reservation> getReservationsByEtudiantId(long idEtudiant);
    public List<Reservation> findReservationsByEtudiantsWithPrefixAB();
}
