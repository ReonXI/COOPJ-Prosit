package tn.esprit.gestionzoo.entities;

public class Animal {

    // ATTRIBUTES
    private String family, name;
    private int age;
    private boolean isMammal;

    // CONSTRUCTEURS
    public Animal() {
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}