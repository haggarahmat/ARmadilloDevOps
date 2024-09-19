package tn.esprit.etudedecas.services;

import tn.esprit.etudedecas.entities.Bloc;
import tn.esprit.etudedecas.entities.Chambre;
import tn.esprit.etudedecas.entities.TypeChambre;

import java.util.List;
import java.util.Set;

public interface IBloc {
    public Bloc addBloc(Bloc b);
    public Bloc updateBloc(Bloc b);
    public List<Bloc> findAllBloc();
    public Bloc findById(long idB);
    public void deleteBloc(long idB);
    public Bloc updateBloc(long idb ,String nomBloc) ;
    public Set<Bloc> findBlocByChambresType(TypeChambre typeC);
    public List<Chambre> getChambresByBlocId(Long blocId);

}
