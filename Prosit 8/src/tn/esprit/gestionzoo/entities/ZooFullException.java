package tn.esprit.gestionzoo.entities;

// Instruction 33
public class ZooFullException extends Exception {
    public ZooFullException() {
        super("Le zoo est plein, impossible d'ajouter un nouvel animal.");
    }
}
