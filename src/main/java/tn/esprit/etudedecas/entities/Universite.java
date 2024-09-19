package tn.esprit.etudedecas.entities;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.etudedecas.entities.Foyer;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long idUniversite;
    private  String nomUniversite;
    private  String adresse;
    @OneToOne
    private Foyer foyer;
}
