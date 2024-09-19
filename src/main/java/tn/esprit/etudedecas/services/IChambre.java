package tn.esprit.etudedecas.services;

import tn.esprit.etudedecas.entities.Bloc;
import tn.esprit.etudedecas.entities.Chambre;

import java.util.List;

public interface IChambre {
    public Chambre addChambre(Chambre c);
    public Chambre updateChambre(Chambre c);
    public List<Chambre> findAllEtudiant();
    public Chambre findById(long idC);
    public void deleteChambre(long idC);
    public Bloc getBlocByChambreId(long idChambre) ;

}
