package com.pluralsight;

public class reservation {

    private int numberOfNights;
    private boolean weekend;
    private String roomType;
    private double price;
    private double reservationTotal;

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }


    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        if (this.roomType.equalsIgnoreCase("king")) {
            price = 139;
        } else if (this.roomType.equalsIgnoreCase("double")) {
            price = 124;
        } else {
            price = 0;
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getReservationTotal() {
        return reservationTotal;
    }

    public void setReservationTotal(double reservationTotal) {
        this.reservationTotal = reservationTotal;
    }
}

