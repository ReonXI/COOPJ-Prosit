class Animal {

    String name;
    String family;

    public Animal(String name, String family) {
        this.name = name;
        this.family = family;
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String toString() {
        return name + " - " + family;
    }
}