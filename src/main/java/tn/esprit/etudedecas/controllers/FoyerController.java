package tn.esprit.etudedecas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudedecas.entities.Foyer;
import tn.esprit.etudedecas.services.FoyerServiceImp;

import java.util.List;

@RestController
@RequestMapping("/foyer")

public class FoyerController {
    @Autowired
    private FoyerServiceImp foyerServiceImp;
@PostMapping ("/add")
    public Foyer addFoyer(@RequestBody  Foyer f) {
return  foyerServiceImp.addFoyer(f);
    }
@PutMapping("/update")
    public Foyer updateFoyer(@RequestBody Foyer f) {
        return  foyerServiceImp.updateFoyer(f);
    }
@GetMapping("/getall")
    public List<Foyer> findAllFoyer() {
        return  foyerServiceImp.findAllFoyer();
    }
    @GetMapping("/get/{idF}")

    public Foyer findById(@PathVariable long idF) {
        return  foyerServiceImp.findById(idF);
    }
    @DeleteMapping("/delete/{idF}")

    public void deleteFoyer(@PathVariable long idF) {
          foyerServiceImp.deleteFoyer(idF);
    }
    @GetMapping("/getbynom/{nomf}")

    public Foyer getByNom(@PathVariable String nomf){
    return foyerServiceImp.getFoyerByNom(nomf);
    }
}
