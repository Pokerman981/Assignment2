/*
 * Developed by Troy Gidney.
 * For project Assignment2 in file Hourly.java.
 * Last modified 1/17/19 7:59 AM.
 * Last Viewed 1/25/19 7:47 PM
 *
 * Copyright (c) 2019. All rights reserved
 */

import javax.swing.*;

//Extending and interfacing with Employee and Payroll respectively
public class Hourly extends Employee implements Payroll {

    //Variables that are needed in the class
    private double hoursWorked = 0;
    private double rate;
    private double pay;

    //The constructor sets the values passed to it to the object variables
    public Hourly(String empNumber, String name, double rate) {
        this.setId(empNumber);
        this.setName(name);
        this.rate = rate;
    }

    //Defining the setPayPeriodDetails method that is implemented from the Payroll interface
    @Override
    public void setPayPeriodDetails() {
        hoursWorked = Integer.valueOf(JOptionPane.showInputDialog("Enter how many hours you worked\n in the past two weeks"));
        calculatePay();
    }

    //Defining the calculatePay method that is implemented from the Payroll interface
    @Override
    public double calculatePay() {
        double overTimeHours;

        //If the worked hours in one week is greater then 40 figure out how many over time hours there are and up the rate by .5
        if (hoursWorked/2 > 40) {
            overTimeHours = (hoursWorked/2) - 40;

            pay = (rate * 40) + (overTimeHours * (rate * 1.5));
        } else { //If the hours are less then
            pay = hoursWorked * rate;
        }
        //Return the pay amount
        return pay;
    }

    //Overriding the toString method to create custom method
    @Override
    public String toString() {
        return super.toString() + " " + this.getId() + " " + this.pay;
    }
}
