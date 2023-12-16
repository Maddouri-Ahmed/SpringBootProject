package tn.esprit.tic.springproject.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproject.Entity.Foyer;
import tn.esprit.tic.springproject.Entity.Universite;
import tn.esprit.tic.springproject.Interfaces.IUniversiteService;
import tn.esprit.tic.springproject.Repository.FoyerRepository;
import tn.esprit.tic.springproject.Repository.UniversiteRepository;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class UniversiteService implements IUniversiteService {
    UniversiteRepository universiteRepository;
    FoyerRepository foyerRepository;
    @Override
    public List<Universite> retrieveAllUniversite() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversite(Long idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }

    @Override
    public void removeUniversite(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }

    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        Foyer foyer = foyerRepository.findById(idFoyer).get();
        Universite universite = universiteRepository.findByNomUniversite(nomUniversite);
        universite.setFoyer(foyer);
        universiteRepository.save(universite);
        return universite;
    }

    @Override
    public Universite desaffecterFoyerAUniversite(long idFoyer) {
        Universite universite = universiteRepository.findById(idFoyer).get();
        universite.setFoyer(null);
        universiteRepository.save(universite);

        return universite;
    }
}
