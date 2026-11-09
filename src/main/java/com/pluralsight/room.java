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
        System.out.println("Check in succesful");

        isDirty=true;
        isOccupied=true;
    }

    public void checkout () {
        System.out.println();
    }

    public String toString() {
        return String.format("Beds: %d, Price: %.2f, Occupied: %b, Dirty: %b, Available: %b",
                getNumberOfBeds(), getPriceOfRoom(), isOccupied(), isDirty(), isAvailable());

    }
}


