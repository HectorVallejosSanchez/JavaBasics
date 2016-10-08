package com.java.classes;

/**
 * Created by Hector Vallejos Sanchez on 06/10/16.
 */
public class Flight {
    private int passengers, flightNumber, seats = 150;
    private char flightClass;
    private boolean[] isSeatAvailable;
    private int totalcheckedBags;
    private int maxCarryOns = seats * 2;

    {
        isSeatAvailable = new boolean[seats];
        for (int i = 0; i < seats; i++) {
            isSeatAvailable[i] = true;
        }
    }

    public Flight(){
    }

    public Flight(int flightNumber){
        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass){
        this.flightClass = flightClass;
    }

    public void addPassengers(){
        if(hasSeating()){
            passengers += 1;
        }else
            hadleTooMany();
    }

    private void hadleTooMany(){
        System.out.println("Too many");
    }
    private boolean hasSeating(){
        return passengers < seats;
    }

    public boolean hasRoom(Flight f2){
        int total = passengers + f2.passengers;
        return total <= seats;
    }

    public Flight createNewWithBoth(Flight f2){
        Flight newflight = new Flight();
        newflight.seats = seats;
        newflight.passengers = passengers + f2.passengers;
        return newflight;
    }
}
