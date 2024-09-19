package tn.esprit.etudedecas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.entities.Bloc;
import tn.esprit.etudedecas.entities.Chambre;
import tn.esprit.etudedecas.entities.TypeChambre;
import tn.esprit.etudedecas.repositories.BlocRepository;

import java.util.List;
import java.util.Set;

@Service

public class BlocServiceImp implements IBloc {
    @Autowired
    private BlocRepository blocRepository;

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc updateBloc(long idb, String nomBloc) {
        Bloc b = blocRepository.findById(idb).orElse(null);
        b.setNomBloc(nomBloc);
        return blocRepository.save(b);
    }

    @Override
    public Set<Bloc> findBlocByChambresType(TypeChambre typeC) {
        return blocRepository.findBlocByChambresTypeC(typeC);
    }

    @Override
    public List<Chambre> getChambresByBlocId(Long blocId) {
        return blocRepository.findChambresByBlocId(blocId);
    }

    @Override
    public List<Bloc> findAllBloc() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc findById(long idB) {
        return blocRepository.findById(idB).orElse(null);
    }

    @Override
    public void deleteBloc(long idB) {
        blocRepository.deleteById(idB);


    }
}
