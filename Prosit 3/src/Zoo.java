class Zoo {

    // ATTRIBUTES
    Animal[] animals;
    String name;
    final int nbrCages = 25;
    int animalCount = 0;

    // CONSTRUCTEUR
    public Zoo(String name) {
        this.name = name;
        animals = new Animal[nbrCages];
    }

    // GETTERS
    public Animal[] getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    // 10/ AJOUT
    public boolean addAnimal(Animal animal) {

        if (animalCount >= animals.length) {
            return false;
        }

        if (searchAnimal(animal) != -1) {
            return false;
        }

        animals[animalCount] = animal;
        animalCount++;

        return true;
    }

    // 11/ AFFICHAGE
    public void displayAnimals() {

        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    // 11/ RECHERCHE
    public int searchAnimal(Animal animal) {

        for (int i = 0; i < animalCount; i++) {

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

        for (int i = position; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[animalCount - 1] = null;
        animalCount--;

        return true;
    }

    // 15/ ZOO PLEIN
    public boolean isZooFull() {

        if (animalCount >= nbrCages) {
            return true;
        }

        return false;
    }

    // 15/ COMPARAISON
    public Zoo comparerZoo(Zoo z1, Zoo z2) {

        if (z1.animalCount > z2.animalCount) {
            return z1;
        }

        return z2;
    }
}