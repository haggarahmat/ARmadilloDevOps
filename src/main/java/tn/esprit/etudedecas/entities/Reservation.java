package tn.esprit.etudedecas.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Reservation implements Serializable {
    @Id

    private String    idReservation;
    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;
    private boolean esValide;
    @ManyToMany
    private List<Etudiant> listEtudiant;

}
