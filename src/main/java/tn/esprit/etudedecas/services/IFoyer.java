package tn.esprit.etudedecas.services;

import tn.esprit.etudedecas.entities.Bloc;
import tn.esprit.etudedecas.entities.Foyer;
import tn.esprit.etudedecas.entities.TypeChambre;

import java.util.List;
import java.util.Set;

public interface IFoyer {
    public Foyer addFoyer(Foyer f);
    public Foyer updateFoyer(Foyer f);
    public List<Foyer> findAllFoyer();
    public Foyer findById(long idF);
    public void deleteFoyer(long idF);
    public Foyer getFoyerByNom(String nomF);


}
