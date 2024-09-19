package tn.esprit.etudedecas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.entities.Bloc;
import tn.esprit.etudedecas.entities.Chambre;
import tn.esprit.etudedecas.repositories.ChambreRepository;

import java.util.List;

@Service

public class ChambreServiceImp implements IChambre {
    @Autowired

    private ChambreRepository chambreRepository;

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);

    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public List<Chambre> findAllEtudiant() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre findById(long idC) {
        return chambreRepository.findById(idC).orElse(null);
    }

    @Override
    public void deleteChambre(long idC) {
        chambreRepository.deleteById(idC);

    }

    @Override
       public Bloc getBlocByChambreId(long idChambre) {
        return chambreRepository.findBlocByChambreId(idChambre);
    }

}
