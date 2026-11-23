package tn.esprit.gestionemployes.main;

import tn.esprit.gestionemployes.entities.Employe;
import tn.esprit.gestionemployes.services.SocieteArrayList;
import java.util.List;

public class GestionEmployesMain {

    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(3, "Zied", "Ahmed", "Informatique", 2);
        Employe e2 = new Employe(1, "Ali", "Mohamed", "RH", 3);
        Employe e3 = new Employe(5, "Nour", "Amira", "Informatique", 1);
        Employe e4 = new Employe(2, "Amina", "Sarra", "Informatique", 2);
        Employe e5 = new Employe(4, "Sami", "Youssef", "RH", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);
        societe.ajouterEmploye(e5);

        System.out.println("--- Employes avant le tri ---");
        societe.displayEmploye();

        System.out.println("\n--- Recherches ---");
        System.out.println("Nom Ali present : " + societe.rechercherEmploye("Ali"));
        System.out.println("Employe id=3 present : " +
                societe.rechercherEmploye(new Employe(3, "Autre", "Autre", "RH", 9)));

        System.out.println("\n--- Tri naturel par id ---");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\n--- Tri par departement, grade, puis nom ---");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        System.out.println("\n--- Recherche avancee : Informatique ---");
        List<Employe> informaticiens = societe.rechercherParDepartement("Informatique");
        for (Employe employe : informaticiens) {
            System.out.println(employe);
        }

        System.out.println("\n--- Suppression de l'employe id=3 ---");
        societe.supprimerEmploye(e1);
        societe.displayEmploye();
    }
}
