package tn.esprit.etudedecas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.etudedecas.entities.Reservation;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
  @Query("SELECT r FROM Reservation r WHERE :idEtudiant IN (SELECT e.idEtudiant FROM r.listEtudiant e)")
    List<Reservation> findReservationsByEtudiantId(@Param("idEtudiant") long idEtudiant);
    @Query("SELECT DISTINCT r FROM Reservation r JOIN r.listEtudiant e WHERE UPPER(e.nomEt) LIKE 'AB%'")
    List<Reservation> findReservationsByEtudiantsWithPrefixAB();

}

