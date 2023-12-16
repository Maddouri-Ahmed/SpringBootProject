package tn.esprit.tic.springproject.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "Bloc")
public class Bloc implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idBloc")

    private Long idBloc;
    private String nomBloc;
    private Long CapaciteBloc;

    @ManyToOne
Foyer foyers ;

    @ManyToOne
    @JoinColumn(name ="universite_id")
private Universite universite ;


    public void setChambres(Chambre chambres) {
    }
}
