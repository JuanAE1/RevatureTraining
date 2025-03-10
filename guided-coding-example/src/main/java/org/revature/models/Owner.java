package org.revature.models;

public class Owner {
    private String name;
    private Animal pet;

    public Owner() {
    }

    public Owner(String name, Animal pet) {
        this.name = name;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }
}
