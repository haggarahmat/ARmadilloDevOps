package tn.esprit.etudedecas.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

import lombok.*;
import tn.esprit.etudedecas.entities.Universite;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long    idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;
    @OneToOne (mappedBy = "foyer")
    private Universite universite;
    @OneToMany (mappedBy = "foyer")
    private List<Bloc> listBloc;
}
