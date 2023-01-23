package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String description = "This animal is mostly " + this.color + ". ";
        description += "It has " + this.numberOfPaws + " paw";

        if (this.numberOfPaws > 1) {
            description += "s";
        }
        description += " and ";

        if (this.hasFur) {
            description += "a ";
        } else {
            description += "no ";
        }

        description += "fur.";

        return description;
    }
}
