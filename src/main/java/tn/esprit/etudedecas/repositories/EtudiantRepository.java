package tn.esprit.etudedecas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.etudedecas.entities.Etudiant;
import tn.esprit.etudedecas.entities.Reservation;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    @Query("SELECT r FROM Reservation r JOIN r.listEtudiant e WHERE e.nomEt = :nomEtudiant")
    List<Reservation> findReservationsByNomEtudiant(@Param("nomEtudiant") String nomEtudiant);

}
