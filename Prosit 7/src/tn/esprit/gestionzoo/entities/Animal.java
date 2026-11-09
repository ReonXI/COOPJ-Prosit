package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal() {
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Prosit 7: Zoo.addAnimal() validates negative ages using an exception.
    public void setAge(int age) {
        this.age = age;
    }

    public void setMammal(boolean mammal) {
        this.isMammal = mammal;
    }

    @Override
    public String toString() {
        return "Family: " + family + ", Name: " + name
                + ", Age: " + age + ", Mammal: " + isMammal;
    }
}
