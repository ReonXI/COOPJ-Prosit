package tn.esprit.gestionemployes.services;

import tn.esprit.gestionemployes.entities.Employe;
import tn.esprit.gestionemployes.interfaces.IGestion;
import tn.esprit.gestionemployes.interfaces.IRechercheAvancee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {

    private ArrayList<Employe> employes;

    public SocieteArrayList() {
        employes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe employe) {
        if (employe != null) {
            employes.add(employe);
        }
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : employes) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }

    // Tri naturel avec compareTo() de Employe
    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    // Tri personnalise : departement, puis grade, puis nom (tous croissants).
    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employes, new Comparator<Employe>() {
            @Override
            public int compare(Employe a, Employe b) {
                int resultat = a.getNomDépartement().compareToIgnoreCase(b.getNomDépartement());
                if (resultat != 0) {
                    return resultat;
                }

                resultat = Integer.compare(a.getGrade(), b.getGrade());
                if (resultat != 0) {
                    return resultat;
                }

                return a.getNom().compareToIgnoreCase(b.getNom());
            }
        });
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> resultat = new ArrayList<>();

        for (Employe employe : employes) {
            if (employe.getNomDépartement().equalsIgnoreCase(nomDepartement)) {
                resultat.add(employe);
            }
        }
        return resultat;
    }
}
