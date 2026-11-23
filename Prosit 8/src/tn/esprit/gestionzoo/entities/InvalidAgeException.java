package tn.esprit.gestionzoo.entities;

// Instruction 34
public class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("Age d'animal invalide : l'age ne peut pas etre negatif.");
    }
}
