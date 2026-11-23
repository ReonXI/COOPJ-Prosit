package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;

public class Zoo {

    // ATTRIBUTES
    private Animal[] animals;
    private String name, city;
    private int nbrAnimals;
    private final int nbrCages = 3;
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private int nbrAquaticAnimals = 0;

    // CONSTRUCTEURS
    public Zoo() {
    }

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        animals = new Animal[nbrCages];
    }

    // GETTERS
    public Animal[] getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    // SETTERS
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public void setCity(String city) {
        this.city = city;
    }

    // 17/ AJOUT
    // 32, 33, 34 / AJOUT ET EXCEPTIONS
    public void addAnimal(Animal animal)
            throws ZooFullException, InvalidAgeException {

        if (animal.getAge() < 0) {
            throw new InvalidAgeException();
        }

        if (nbrAnimals >= nbrCages) {
            throw new ZooFullException();
        }

        if (searchAnimal(animal) != -1) {
            return;
        }

        animals[nbrAnimals] = animal;
        nbrAnimals++;
    }

    // 11/ AFFICHAGE
    public void displayAnimals() {

        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    // 11/ RECHERCHE
    public int searchAnimal(Animal animal) {

        for (int i = 0; i < nbrAnimals; i++) {

            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }

        return -1;
    }

    // 13/ SUPPRESSION
    public boolean removeAnimal(Animal animal) {

        int position = searchAnimal(animal);

        if (position == -1) {
            return false;
        }

        for (int i = position; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[nbrAnimals - 1] = null;
        nbrAnimals--;

        return true;
    }

    // 15/ ZOO PLEIN
    public boolean isZooFull() {

        if (nbrAnimals >= nbrCages) {
            return true;
        }

        return false;
    }

    // 15/ COMPARAISON
    public Zoo comparerZoo(Zoo z1, Zoo z2) {

        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        }

        return z2;
    }

    // AFFICHAGE DU ZOO
    public void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city +
                ", N° Cages: " + nbrCages +
                ", N° animals: " + nbrAnimals);
    }
    // Instruction 25
    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquaticAnimals < aquaticAnimals.length) {
            aquaticAnimals[nbrAquaticAnimals] = aquatic;
            nbrAquaticAnimals++;
        } else {
            System.out.println("The aquatic animals array is full.");
        }
    }

    // Instruction 26
    public void displayAquaticAnimals() {
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            aquaticAnimals[i].swim();
        }
    }

    // Instruction 27
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;

        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];

                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }

        return maxDepth;
    }

    // Instruction 28
    public void DisplayNumberOfAquaticsByType() {
        int dolphins = 0;
        int penguins = 0;

        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphins++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguins++;
            }
        }

        System.out.println("Number of dolphins: " + dolphins);
        System.out.println("Number of penguins: " + penguins);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city +
                ", N° Cages: " + nbrCages +
                ", N° animals: " + nbrAnimals;
    }
}