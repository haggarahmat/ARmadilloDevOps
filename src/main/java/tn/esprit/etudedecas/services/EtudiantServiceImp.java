package tn.esprit.etudedecas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.entities.Etudiant;
import tn.esprit.etudedecas.entities.Reservation;
import tn.esprit.etudedecas.repositories.EtudiantRepository;

import java.util.List;
@Service

public class EtudiantServiceImp implements IEtudiant {
    @Autowired
private EtudiantRepository etudiantRepository;


    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public List<Etudiant> findAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant findById(long idE) {
        return etudiantRepository.findById(idE).orElse(null);
    }

    @Override
    public void deleteEtudiant(long idE) {
        etudiantRepository.deleteById(idE);

    }
    public List<Reservation> getReservationsByNomEtudiant(String nomEtudiant) {
        return etudiantRepository.findReservationsByNomEtudiant(nomEtudiant);
    }
}
