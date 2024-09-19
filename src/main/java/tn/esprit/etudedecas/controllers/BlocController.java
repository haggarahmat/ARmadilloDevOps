package tn.esprit.etudedecas.controllers;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudedecas.entities.Bloc;
import tn.esprit.etudedecas.entities.Chambre;
import tn.esprit.etudedecas.entities.TypeChambre;
import tn.esprit.etudedecas.services.BlocServiceImp;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/bloc")
@AllArgsConstructor
public class BlocController {
//    @Autowired
    private BlocServiceImp blocServiceImp;
    @PostMapping("/add")
    public Bloc addFoyer(@RequestBody Bloc f) {
        return  blocServiceImp.addBloc(f);
    }
    @PutMapping("/update")
    public Bloc updateFoyer(@RequestBody Bloc f) {
        return  blocServiceImp.updateBloc(f);
    }

    @GetMapping("/getall")
    public List<Bloc> findAllFoyer() {
        return  blocServiceImp.findAllBloc();
    }
    @GetMapping("/get/{idF}")

    public Bloc findById(@PathVariable long idF) {
        return  blocServiceImp.findById(idF);
    }
    @DeleteMapping("/delete/{idF}")

    public void deleteFoyer(@PathVariable long idF) {
        blocServiceImp.deleteBloc(idF);
    }
    @GetMapping("/getblocbytypec/{typC}")

    public Set<Bloc> findBlocByTypeC( @PathVariable  TypeChambre typC){
        return blocServiceImp.findBlocByChambresType(typC);
    }
    @GetMapping("/{blocId}/chambres")
    @JsonIgnore
    public List<Chambre> getChambresByBlocId(@PathVariable Long blocId) {
        return blocServiceImp.getChambresByBlocId(blocId);
    }

}