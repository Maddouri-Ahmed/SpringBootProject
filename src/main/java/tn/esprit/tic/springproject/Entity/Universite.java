package tn.esprit.tic.springproject.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Entity
@Getter
@Setter
@Table(name = "Universite")
public class Universite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUniversite")

    private Long idUniversite;
    private String nomUniversite;
    private String adresse;



    @OneToOne
    private Foyer foyers;


    public void setFoyer(Object o) {
    }
}
