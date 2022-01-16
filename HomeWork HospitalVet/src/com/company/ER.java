package com.company;

import java.util.ArrayList;

public class ER {

    private int numberOfBeds = 5;
    private ArrayList<Animals> addAnimalsToBed = new ArrayList<>();
    private int animalsCounter = 0;


    public void addAnimalToBed(Animals animals) {
        if (animalsCounter < 5) {
            addAnimalsToBed.add(animals);
            animalsCounter++;
            System.out.println(animals.getAnimalName() + " entered the ER. " );
        }else {
            System.err.println( "Not enough beds for " + animals.getAnimalName() + ".");
        }
    }

    public void removeAnimalFromBed(Animals animal) {
        addAnimalsToBed.remove(animal);
        System.out.println(animal.getAnimalName() + " has left its bed.");
        animalsCounter--;
    }

    public boolean isFullInTheER(){
        if (numberOfBeds != animalsCounter){
            System.out.println("The beds Status is.. and the number of pets is: " + animalsCounter + ". You can put your pet in the bed.");
            return true;
        }
        System.out.println("All the beds Full and the number of pets and beds is: " + animalsCounter + ". You need to wait.");

        return false;
    }

}
