package tn.esprit.gestionemployes.entities;

public class Employe implements Comparable<Employe> {

    private int id;
    private String nom;
    private String prenom;
    private String nomDépartement;
    private int grade;

    // Constructeur par defaut
    public Employe() {
    }

    // Constructeur parametre
    public Employe(int id, String nom, String prenom, String nomDépartement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDépartement = nomDépartement;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDépartement() {
        return nomDépartement;
    }

    public void setNomDépartement(String nomDépartement) {
        this.nomDépartement = nomDépartement;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDepartement='" + nomDépartement + '\'' +
                ", grade=" + grade +
                '}';
    }

    // Tri naturel : par id croissant
    @Override
    public int compareTo(Employe autre) {
        return Integer.compare(this.id, autre.id);
    }

    // Convention choisie : deux employes sont identiques si leur id est identique.
    // Cela permet a contains() et remove() de retrouver un autre objet ayant le meme id.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Employe)) {
            return false;
        }
        Employe autre = (Employe) obj;
        return this.id == autre.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
