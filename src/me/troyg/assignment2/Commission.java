/*
 * Developed by Troy Gidney.
 * For project Assignment2 in file Commission.java.
 * Last modified 1/17/19 7:59 AM.
 * Last Viewed 1/25/19 7:47 PM
 *
 * Copyright (c) 2019. All rights reserved
 */

package me.troyg.assignment2;

import me.troyg.assignment2.Object.Employee;

import javax.swing.*;

//Extending and interfacing with Employee and Payroll respectively
public class Commission extends Employee implements Payroll {

    //Variables that are needed in the class
    private double pay = 0;
    private double commissionRate;
    private double sales;

    //The constructor sets the values passed to it to the object variables
    public Commission(String empNumber, String empName, double commissionRate) {
        this.setId(empNumber);
        this.setName(empName);
        this.commissionRate = commissionRate;
    }

    //Defining the setPayPeriodDetails method that is implemented from the Payroll interface
    @Override
    public void setPayPeriodDetails() {
        sales = Integer.valueOf(JOptionPane.showInputDialog("Enter how many sales there were\n for the current pay period"));
        calculatePay();
    }

    //Defining the calculatePay method that is implemented from the Payroll interface
    @Override
    public double calculatePay() { //Calculate the pay on a basic multiplication level
        pay = sales * commissionRate;
        return pay;
    }

    //Overriding the toString method to create custom method
    @Override
    public String toString() {
        return super.toString() + " " + this.getId() + " " + this.pay;
    }
}
