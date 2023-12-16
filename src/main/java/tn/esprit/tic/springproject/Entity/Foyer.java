package tn.esprit.tic.springproject.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "Foyer")
public class Foyer implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name ="Foyer")
    private Long idFoyer ;
    private String nomFoyer ;
    private Long capaciteFoyer ;


    @OneToMany (cascade = CascadeType.ALL, mappedBy = "foyers")
    private Set<Bloc> blocs;
    @OneToOne(mappedBy = "foyers")
    @JsonIgnore
    private Universite universite ;

    public String getNomBloc() {
        return null;
    }

    public void setBloc(Bloc bloc) {
    }
}
