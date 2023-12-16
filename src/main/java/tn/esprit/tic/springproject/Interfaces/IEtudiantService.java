package tn.esprit.tic.springproject.Interfaces;

import tn.esprit.tic.springproject.Entity.Etudiant;

import java.util.List;

public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant(Etudiant e);

    Etudiant updateEtudiant(Etudiant e);

    Etudiant retrieveEtudiant(Long idEtudiant);

    void removeEtudiant(Long idEtudiant);
    Etudiant affecterEtudiantAReservation(String nomEt , String prenomEt ,  String   idReservation );
}
