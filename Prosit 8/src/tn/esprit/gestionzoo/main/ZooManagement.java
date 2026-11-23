package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.ZooFullException;
import tn.esprit.gestionzoo.entities.InvalidAgeException;
public class ZooManagement {

    public static void main(String[] args) {

        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");

        Animal dog = new Animal("Canine", "Snoopy", 2, true);

        myZoo.displayZoo();

        System.out.println(myZoo);
        System.out.println(dog);
        Animal animal = new Animal("Animal", "Generic", 2, true);

        Terrestrial terrestrial = new Terrestrial("Feline", "Simba", 8, true, 4);
        Dolphin dolphin = new Dolphin("Mammal", "Flipper", 5, true, "Ocean", 25.5f);
        Penguin penguin = new Penguin("Bird", "Pingu", 3, false, "Ocean", 200.0f);
        System.out.println(terrestrial);

        System.out.println(dolphin);
        System.out.println(penguin);

        //aquatic.swim();
        dolphin.swim();
        penguin.swim();
        // Instruction 25
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);

        Dolphin dolphin2 = new Dolphin("Mammal", "Dory", 4, true, "Ocean", 20.0f);
        Penguin penguin2 = new Penguin("Bird", "Pingu2", 2, false, "Ocean", 150.0f);

        myZoo.addAquaticAnimal(dolphin2);
        myZoo.addAquaticAnimal(penguin2);

// Instruction 26
        myZoo.displayAquaticAnimals();

// Instruction 27
        System.out.println("Maximum penguin swimming depth: "
                + myZoo.maxPenguinSwimmingDepth());

// Instruction 28
        myZoo.DisplayNumberOfAquaticsByType();

// Instruction 31
        Penguin penguin3 = new Penguin("Bird", "Pingu2", 2, false, "Ocean", 300.0f);
        System.out.println("Are the penguins equal? " + penguin2.equals(penguin3));
        // Instructions 32, 33, 34 : Test des exceptions
        Animal[] essais = {
                new Animal("Felidae", "Leo", 3, true),
                new Animal("Felidae", "BadAge", -2, true),
                new Animal("Canidae", "Rex", 2, true),
                new Animal("Bird", "Coco", 1, false),
                new Animal("Felidae", "Extra", 5, true)
        };

        for (Animal a : essais) {

            System.out.println("Tentative d'ajout: " + a.getName());

            try {
                myZoo.addAnimal(a);
            } catch (ZooFullException | InvalidAgeException ex) {
                System.out.println(ex.getMessage());
            } finally {
                System.out.println("Nombre d'animaux: "
                        + myZoo.getNbrAnimals());
            }
        }
    }
}