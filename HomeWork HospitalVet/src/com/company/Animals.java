package com.company;


public class Animals {


    private String animalName;
    private String type;
    private int chipNumber;

    public Animals(String animalName, String type, int chipNumber) {
        this.animalName = animalName;
        this.type = type;
        this.chipNumber = chipNumber;
    }

    public String getAnimalName(){
        return animalName;
    }
    public String getType(){
        return type;
    }
    public int getChipNumber(){
        return chipNumber;
    }

    @Override
    public String toString(){
        return "Pet Name: " + getAnimalName() + " "  + "Type Of Pet: " + getType() + ":" + " " + "Chip Number: " + getChipNumber();
     }

}

