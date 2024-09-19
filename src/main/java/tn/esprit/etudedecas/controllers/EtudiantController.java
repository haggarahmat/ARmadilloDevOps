package tn.esprit.etudedecas.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudedecas.entities.Etudiant;
import tn.esprit.etudedecas.entities.Reservation;
import tn.esprit.etudedecas.services.EtudiantServiceImp;

import java.util.List;
@RestController
@RequestMapping("/etudiant")
@AllArgsConstructor
public class EtudiantController {

    //@Autowired
    private EtudiantServiceImp etudiantServiceImp;
    @PostMapping("/add")
    public Etudiant addEtudiant(@RequestBody Etudiant f) {
        return  etudiantServiceImp.addEtudiant(f);
    }
    @PutMapping("/update")
    public Etudiant updateEtudiant(@RequestBody Etudiant f) {
        return  etudiantServiceImp.updateEtudiant(f);
    }
    @GetMapping("/getall")
    public List<Etudiant> findAllEtudiant() {
        return  etudiantServiceImp.findAllEtudiant();
    }
    @GetMapping("/get/{idE}")

    public Etudiant findByIdE(@PathVariable long idE) {
        return  etudiantServiceImp.findById(idE);
    }
    @DeleteMapping("/delete/{idE}")

    public void deleteEtudiant(@PathVariable long idE) {
        etudiantServiceImp.deleteEtudiant(idE);
    }

    @GetMapping("/{nomEtudiant}/reservations")
    public ResponseEntity<List<Reservation>> getReservationsByNomEtudiant(@PathVariable String nomEtudiant) {
        List<Reservation> reservations = etudiantServiceImp.getReservationsByNomEtudiant(nomEtudiant);

        if (reservations.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(reservations);
        }
    }
}
