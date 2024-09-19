package tn.esprit.etudedecas.services;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.entities.Foyer;
import tn.esprit.etudedecas.repositories.FoyerRepository;

import java.util.List;
@Service
//@AllArgsConstructor
public class FoyerServiceImp implements IFoyer {
    @Autowired
    private FoyerRepository foyerRepository;

    @Override
    public Foyer addFoyer(Foyer f) {
        return  foyerRepository.save(f);

    }

    @Override
    public Foyer updateFoyer(Foyer f) {

        return  foyerRepository.save(f);
    }

    @Override
    public List<Foyer> findAllFoyer() {

        return foyerRepository.findAll();
    }

    @Override
    public Foyer findById(long idF) {
        return foyerRepository.findById(idF).orElse(null);

    }

    @Override
    public void deleteFoyer(long idF) {
       foyerRepository.deleteById(idF);
    }

    @Override
    public Foyer getFoyerByNom(String nomF) {
        return foyerRepository.findByNomFoyer(nomF);
    }
}
