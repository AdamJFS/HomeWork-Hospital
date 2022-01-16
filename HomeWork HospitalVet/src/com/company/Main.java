package com.company;

public class Main {

    public static void main(String[] args) {
        Animals rembo = new Animals("Ramo", "Bear", 1);
	    Hospital hospital = new Hospital();
        ER er = new ER();
        Client c1 = new Client("Jack", "Richer", "055-4321456", false, new Animals("COCI", "CAT", 111));
        Client c2 = new Client("Bill", "Gates", "055-4353467", true, new Animals("snopi", "Dog", 222));
        Client c3 = new Client("James", "Bond", "052-6666721", false, new Animals("JoJo", "Spider", 333));
        Client c4 = new Client("Dom", "Rom", "052-6558721", true, new Animals("Lucky", "Dog", 444));
        Client c5 = new Client("Miki", "Black", "057-12346721", false, new Animals("Tuna", "Fish", 555));
        Client c6 = new Client("Bobi", "Jons", "050-3332444", false, new Animals("Joni", "Horse", 666));
        hospital.addClient(c1);
        hospital.addClient(c2);
        hospital.addPetToClient(1, rembo);
        hospital.addClient(c3);
        hospital.removePetFromClient(2, c2.pets);
        hospital.addClient(c4);
        hospital.addClient(c5);
        hospital.removeClient(c4);
        c2.sendMessageToDogOwners();
        er.addAnimalToBed(c1.pets);
        er.addAnimalToBed(c2.pets);
        er.addAnimalToBed(c3.pets);
        er.addAnimalToBed(c4.pets);
        er.addAnimalToBed(c5.pets);
        er.addAnimalToBed(c6.pets);
        er.removeAnimalFromBed(c2.pets);
        er.addAnimalToBed(c6.pets);
        er.isFullInTheER();


    }
}
