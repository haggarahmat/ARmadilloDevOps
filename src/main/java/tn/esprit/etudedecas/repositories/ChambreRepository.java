package tn.esprit.etudedecas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.etudedecas.entities.Bloc;
import tn.esprit.etudedecas.entities.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    @Query("SELECT c.bloc FROM Chambre c WHERE c.idChambre = :idChambre")
    Bloc findBlocByChambreId(@Param("idChambre") long idChambre);
}


