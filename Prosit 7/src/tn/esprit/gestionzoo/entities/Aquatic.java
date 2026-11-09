package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public abstract class Aquatic extends Animal {
    protected String habitat;

    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal,
                   String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // Instruction 26
    public abstract void swim();

    // Instruction 31: same name, age and habitat
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Aquatic)) {
            return false;
        }

        Aquatic other = (Aquatic) obj;
        return Objects.equals(getName(), other.getName())
                && getAge() == other.getAge()
                && Objects.equals(habitat, other.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), habitat);
    }

    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }
}
