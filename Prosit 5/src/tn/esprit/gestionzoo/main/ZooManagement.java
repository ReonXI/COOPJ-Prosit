package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;

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

        Aquatic aquatic = new Aquatic("Fish", "Nemo", 1, true, "Ocean");
        Terrestrial terrestrial = new Terrestrial("Feline", "Simba", 8, true, 4);
        Dolphin dolphin = new Dolphin("Mammal", "Flipper", 5, true, "Ocean", 25.5f);
        Penguin penguin = new Penguin("Bird", "Pingu", 3, false, "Ocean", 200.0f);

        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        aquatic.swim();
        dolphin.swim();
        penguin.swim();
    }
}