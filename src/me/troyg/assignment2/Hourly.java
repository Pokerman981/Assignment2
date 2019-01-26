package me.troyg.assignment2;

import me.troyg.assignment2.Object.Employee;

import javax.swing.*;

public class Hourly extends Employee implements Payroll {

    private double hoursWorked = 0;
    private double rate;
    private double pay;


    public Hourly(String empNumber, String name, double rate) {

        this.setId(empNumber);
        this.setName(name);
        this.rate = rate;
    }

    @Override
    public void setPayPeriodDetails() {
        hoursWorked = Integer.valueOf(JOptionPane.showInputDialog("Enter how many hours you worked\n in the past two weeks"));
        calculatePay();
    }

    @Override
    public double calculatePay() {
        double overTimeHours;
        if (hoursWorked/2 > 40) {
            overTimeHours = (hoursWorked/2) - 40;

            pay = (rate * 40) + (overTimeHours * (rate * 1.5));
        } else {
            pay = hoursWorked * rate;
        }
        return pay;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.getId() + " " + this.pay;
    }
}
