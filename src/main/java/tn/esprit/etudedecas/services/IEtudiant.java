package tn.esprit.etudedecas.services;

import tn.esprit.etudedecas.entities.Etudiant;
import tn.esprit.etudedecas.entities.Reservation;

import java.util.List;

public interface IEtudiant {
    public Etudiant addEtudiant(Etudiant e);
    public Etudiant updateEtudiant(Etudiant e);
    public List<Etudiant> findAllEtudiant();
    public Etudiant findById(long idE);
    public void deleteEtudiant(long idE);
    public List<Reservation> getReservationsByNomEtudiant(String nomEtudiant);
}
