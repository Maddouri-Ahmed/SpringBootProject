package tn.esprit.tic.springproject.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name="Etudiant")
public class Etudiant implements Serializable {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="idEtudiant")

    private Long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole ;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;


    @ManyToMany (mappedBy= "etudiants", cascade= CascadeType.ALL )
   private Set<Reservation> reservations ;

}
