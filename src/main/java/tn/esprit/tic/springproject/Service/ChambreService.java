package tn.esprit.tic.springproject.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproject.Entity.Bloc;
import tn.esprit.tic.springproject.Entity.Chambre;
import tn.esprit.tic.springproject.Entity.TypeChambre;
import tn.esprit.tic.springproject.Interfaces.IchambreService;
import tn.esprit.tic.springproject.Repository.ChambreRepository;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class ChambreService implements IchambreService {
    ChambreRepository chambreRepository;
    @Override
    public List<Chambre> retrieveAllChambre() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre ch) {
        return chambreRepository.save(ch);
    }

    @Override
    public Chambre updateChambre(Chambre ch) {
        return chambreRepository.save(ch);
    }

    @Override
    public Chambre retrieveChambre(Long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }

    @Override
    public void removeChambre(Long idChambre) {
        chambreRepository.deleteById(idChambre);
    }

    @Override
    public List<Chambre> getChambresParNomBloc(String nomBloc) {
        return chambreRepository.findByBlocNomBloc(nomBloc);
    }

    @Override
    public long nbChambreParTypeEtBloc(TypeChambre typeChambre, Bloc bloc) {
        return chambreRepository.countByTypeChambreAndBloc(typeChambre, bloc);
    }

    @Scheduled(fixedRate = 300000)
    @Override
    public void pourcentageChambreParTypeChambre() {


        List<Chambre> chambres = chambreRepository.findAll();

        int nombreChambresSimple = 0;
        int nombreChambresDouble = 0;
        int nombreChambresTriple = 0;
        long nombrechambre = chambreRepository.count();
        System.out.println("nb totals des chambres est : " +nombrechambre );
        for (Chambre chambre : chambres) {

            switch (chambre.getTypeChambre()) {
                case SIMPLE:
                    nombreChambresSimple++;
                    break;
                case DOUBLE:
                    nombreChambresDouble++;
                    break;
                case TRIPLE:
                    nombreChambresTriple++;
                    break;
            }
        }

        double pourcentageChambresSimple = (double) nombreChambresSimple / chambres.size() * 100;
        double pourcentageChambresDouble = (double) nombreChambresDouble / chambres.size() * 100;
        double pourcentageChambresTriple = (double) nombreChambresTriple / chambres.size() * 100;

        System.out.println("pourcentage des chambres pour le type SIMPLE est égale à " + pourcentageChambresSimple);
        System.out.println("pourcentage des chambres pour le type DOUBLE est égale à " + pourcentageChambresDouble);
        System.out.println("pourcentage des chambres pour le type TRIPLE est égale à " + pourcentageChambresTriple);

    }


}

