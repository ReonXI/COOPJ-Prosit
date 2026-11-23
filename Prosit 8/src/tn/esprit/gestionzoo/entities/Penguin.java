package tn.esprit.gestionzoo.entities;
import java.util.Objects;

public class Penguin extends Aquatic {

    protected float swimmingDepth;

    public Penguin() {
    }

    public Penguin(String family, String name, int age, boolean isMammal,
                   String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth=" + swimmingDepth;
    }
    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }
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
}