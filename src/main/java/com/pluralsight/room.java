package com.pluralsight;

public class room {

    private int numberOfBeds;
    private double priceOfRoom;
    private boolean isDirty;
    private boolean isOccupied;

    public room(int numberOfBeds, double priceOfRoom, boolean isDirty, boolean isOccupied) {
        this.numberOfBeds = numberOfBeds;
        this.priceOfRoom = priceOfRoom;
        this.isDirty = isDirty;
        this.isOccupied = isOccupied;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPriceOfRoom() {
        return priceOfRoom;
    }

    public void setPriceOfRoom(double priceOfRoom) {
        this.priceOfRoom = priceOfRoom;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isAvailable() {
        if (!isDirty && !isOccupied) {
            return true;
        }
        return false;
    }

    public void checkin () {
        System.out.print("--------------------------------------------------");
        System.out.println("            Check in succesful");
        System.out.print("--------------------------------------------------");
        isDirty=true;
        isOccupied=true;
    }

    public void checkout () {
        System.out.print("--------------------------------------------------");
        System.out.println("Thanks for staying with us. Have a nice Day!");
        System.out.print("--------------------------------------------------");

        isDirty=true;
        isOccupied=false;
    }

    public void callToCleanRoom () {
        System.out.print("-------------------------------------------------------------");
        System.out.println("Cleaning has been ordered, room will be cleaned shortly");
        System.out.print("-------------------------------------------------------------");

        isDirty=false;
        isOccupied=false;
    }

    public String toString() {
        return String.format("Beds: %d, Price: %.2f, Occupied: %b, Dirty: %b, Available: %b",
                getNumberOfBeds(), getPriceOfRoom(), isOccupied(), isDirty(), isAvailable());

    }
    public void frontDesk () {

        System.out.println("""
                ----------------------------------------
                                
                                WELCOME
                                
                ----------------------------------------
                What would you like to do?
                ----------------------------------------
                
                1) Check in
                2) Check out
                2) Clean a room
                 
                0) Exit""");
    }
}


