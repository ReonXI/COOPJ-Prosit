package tn.esprit.gestionzoo.entities;

public class Zoo {
    // Attributes from Prosit 4-6
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrAnimals;
    private final int nbrCages;

    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private int nbrAquaticAnimals = 0;

    public Zoo() {
        this("Zoo", "Unknown city");
    }

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        // Instruction 33: use 3 cages for Prosit 7 testing
        this.nbrCages = 3;
        this.animals = new Animal[nbrCages];
        this.nbrAnimals = 0;
    }

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

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Instructions 32, 33, 34: return void and raise checked exceptions
    public void addAnimal(Animal animal)
            throws ZooFullException, InvalidAgeException {
        if (animal == null) {
            return;
        }

        if (animal.getAge() < 0) {
            throw new InvalidAgeException();
        }

        if (isZooFull()) {
            throw new ZooFullException();
        }

        // Keep the old Prosit duplicate check (same animal name)
        if (searchAnimal(animal) != -1) {
            return;
        }

        animals[nbrAnimals] = animal;
        nbrAnimals++;
    }

    public void displayAnimals() {
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        if (animal == null) {
            return -1;
        }
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName() != null
                    && animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

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

    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }

    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        }
        return z2;
    }

    public void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city
                + ", Cages: " + nbrCages + ", Animals: " + nbrAnimals);
    }

    // Instruction 25
    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquatic != null && nbrAquaticAnimals < aquaticAnimals.length) {
            aquaticAnimals[nbrAquaticAnimals] = aquatic;
            nbrAquaticAnimals++;
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
        return "Name: " + name + ", City: " + city
                + ", Cages: " + nbrCages + ", Animals: " + nbrAnimals;
    }
}
