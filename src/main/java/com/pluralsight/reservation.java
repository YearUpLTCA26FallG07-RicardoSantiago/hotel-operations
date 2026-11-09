package com.pluralsight;

public class reservation {

    private int numberOfNights;
    private boolean isWeekend;
    private String roomType;
    private double getPrice;
    private double reservationTotal;

    public double getReservationTotal() {
        return reservationTotal;
    }

    public double getGetPrice() {
        return getPrice;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
              // room can be king or double
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
}
