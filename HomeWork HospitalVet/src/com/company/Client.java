package com.company;

import java.util.ArrayList;

public class Client {

    ArrayList<Animals> animals = new ArrayList<>();

    static int counter;

    private int clientNumber;
    private String firstName;
    private String lastName;
    private String phone;
    Animals pets;
    private boolean ads;

    public Client(String firstName, String lastName, String phone, boolean ads, Animals pets) {
        this.clientNumber = ++counter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.pets = pets;
        this.ads = ads;
        this.animals.add(this.pets);

    }
    public ArrayList<Animals> getAnimals(){
        return animals;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public boolean isAds() {
        if (ads == true){
            System.out.println("Hello " + firstName + " " + lastName + ", You will Get ads every week. " + " To this number: " + phone);
        }else {
            System.out.println("Hello " + firstName + " " + lastName + ", We will not send you any ads at all.");
        }
        return false;
    }


    public void sendMessageToDogOwners(){
        System.out.println("Hello! " + getFirstName() + " " + getLastName() + ", You need to come to vaccine your pet " + phone);

    }

}
