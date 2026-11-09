package com.pluralsight;

public class Employee {

    private double employeeID;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;
    private int regularHours;
    private int overtimeHours;

    public int getRegularHours() {
        return regularHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public double getTotalPay() {
        return totalPay;
    }

    private double totalPay;

    public double getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(double employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
