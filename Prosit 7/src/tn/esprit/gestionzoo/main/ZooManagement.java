package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.ZooFullException;
import tn.esprit.gestionzoo.entities.InvalidAgeException;

public class ZooManagement {
    public static void main(String[] args) {
        // Existing Prosit 4 tests
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

        // Existing Prosit 5 tests
        Terrestrial terrestrial = new Terrestrial("Feline", "Simba", 8, true, 4);
        Dolphin dolphin = new Dolphin("Mammal", "Flipper", 5, true, "Ocean", 25.5f);
        Penguin penguin = new Penguin("Bird", "Pingu", 3, false, "Ocean", 200.0f);

        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);
        dolphin.swim();
        penguin.swim();

        // Existing Prosit 6 tests - Instructions 25-28 and 31
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);
        Dolphin dolphin2 = new Dolphin("Mammal", "Dory", 4, true, "Ocean", 20.0f);
        Penguin penguin2 = new Penguin("Bird", "Pingu2", 2, false, "Ocean", 150.0f);
        myZoo.addAquaticAnimal(dolphin2);
        myZoo.addAquaticAnimal(penguin2);

        myZoo.displayAquaticAnimals();
        System.out.println("Max penguin depth: " + myZoo.maxPenguinSwimmingDepth());
        myZoo.DisplayNumberOfAquaticsByType();

        Penguin penguin3 = new Penguin("Bird", "Pingu2", 2, false, "Ocean", 300.0f);
        System.out.println("Are penguins equal? " + penguin2.equals(penguin3));

        // Prosit 7 - Instructions 32-34
        System.out.println("--- Prosit 7: exceptions ---");
        Zoo smallZoo = new Zoo("Small Zoo", "Ariana"); // Capacity is 3

        tenterAjout(smallZoo, new Animal("Cats", "Leo", 4, true));
        tenterAjout(smallZoo, new Animal("Cats", "BadAge", -2, true));
        tenterAjout(smallZoo, new Animal("Canine", "Rex", 3, true));
        tenterAjout(smallZoo, new Animal("Birds", "Coco", 2, false));
        tenterAjout(smallZoo, new Animal("Birds", "Extra", 1, false));
    }

    // Keep main running and print the count after every attempt
    public static void tenterAjout(Zoo zoo, Animal animal) {
        System.out.println("Trying to add: " + animal.getName());
        try {
            zoo.addAnimal(animal);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        } catch (ZooFullException e) {
            System.out.println("Zoo full: " + e.getMessage());
        } finally {
            System.out.println("Number of animals: " + zoo.getNbrAnimals());
        }
    }
}
