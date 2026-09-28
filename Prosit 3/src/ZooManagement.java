public class ZooManagement {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("My Zoo");

        Animal lion = new Animal("Lion", "Felidae");
        Animal tiger = new Animal("Tiger", "Felidae");

        zoo.addAnimal(lion);
        zoo.addAnimal(tiger);

        zoo.displayAnimals();

        System.out.println(zoo.searchAnimal(lion));

        zoo.removeAnimal(tiger);

        zoo.displayAnimals();
    }
}