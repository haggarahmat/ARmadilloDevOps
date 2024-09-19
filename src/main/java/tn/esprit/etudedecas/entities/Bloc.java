package tn.esprit.etudedecas.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
//@FieldDefaults (level = AccessLevel.PRIVATE)
//@RequiredArgsConstructor
//@Builder
public class Bloc implements Serializable  {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long    idBloc;
        private String nomBloc;
        private long capaciteBloc;
        @ManyToOne
        @JsonIgnore
        private Foyer foyer;
        @OneToMany (mappedBy = "bloc")
        private List<Chambre> chambres;


}
