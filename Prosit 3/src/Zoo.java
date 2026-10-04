public class Zoo {

    // ATTRIBUTES
    Animal[] animals;
    String name, city;
    int nbrAnimals;
    final int nbrCages = 25;

    // CONSTRUCTEURS
    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }

    // 10/ AJOUT
    public boolean addAnimal(Animal animal) {

        if (nbrAnimals >= animals.length) {
            return false;
        }

        if (searchAnimal(animal) != -1) {
            return false;
        }

        animals[nbrAnimals] = animal;
        nbrAnimals++;

        return true;
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

    // 14/ AFFICHAGE DU ZOO
    public void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city +
                ", N° Cages: " + nbrCages +
                ", N° animals: " + nbrAnimals);
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

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city +
                ", N° Cages: " + nbrCages +
                ", N° animals: " + nbrAnimals;
    }
}