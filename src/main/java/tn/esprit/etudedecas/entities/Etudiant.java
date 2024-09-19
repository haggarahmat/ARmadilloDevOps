package tn.esprit.etudedecas.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long    idEtudiant;
    private String nomEt;
    private String prenomEt;

    private long cin;
    private String ecole;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    @ManyToMany (mappedBy = "listEtudiant",cascade = CascadeType.ALL)
    @JsonIgnore

    private List<Reservation> lisReservation;
}
