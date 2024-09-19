package tn.esprit.etudedecas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.etudedecas.entities.Bloc;
import tn.esprit.etudedecas.entities.Chambre;
import tn.esprit.etudedecas.entities.TypeChambre;

import java.util.List;
import java.util.Set;

public interface BlocRepository extends JpaRepository<Bloc,Long> {

    public Set<Bloc> findBlocByChambresTypeC(TypeChambre typeC);
    @Query("SELECT c FROM Chambre c WHERE c.bloc.idBloc = :blocId")
    List<Chambre> findChambresByBlocId(@Param("blocId") Long blocId);
}

