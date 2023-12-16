package tn.esprit.tic.springproject.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name ="Chambre")
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idChambre")
    private Long idChambre;
    private Long numeroChambre;
    private TypeChambre typeChambre;

    @ManyToOne
    Bloc bloc;
    @OneToMany
    private Set<Reservation> reservations;
}
