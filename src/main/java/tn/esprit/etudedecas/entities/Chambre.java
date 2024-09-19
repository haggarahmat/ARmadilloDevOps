package tn.esprit.etudedecas.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

import lombok.*;
import  tn.esprit.etudedecas.entities.Reservation;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;
    private  long numeroChambre;
    @Enumerated (EnumType.STRING)
    private TypeChambre typeC;
    @OneToMany
    private List<Reservation> listReservation;
    @ManyToOne
    @JsonIgnore
    private  Bloc bloc;
}
