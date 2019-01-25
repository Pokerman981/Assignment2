package me.troyg.assignment2;

import me.troyg.assignment2.Object.Employee;

import javax.swing.*;

public class Hourly implements Payroll {

    Employee employee = new Employee();
    private double hoursWorked = 0;
    private double rate;
    private double pay;

    public Hourly(String empNumber, String name, double rate) {
        employee.setId(empNumber);
        employee.setName(name);
        this.rate = rate;
    }

    @Override
    public void setPayPeriodDetails() {
        hoursWorked = Integer.valueOf(JOptionPane.showInputDialog("Enter how many hours you worked\n in the past two weeks"));
        calculatePay();
    }

    @Override
    public double calculatePay() {
        if (hoursWorked/2 < 40) {
            pay = rate * hoursWorked;
        } else {
            pay = hoursWorked * (rate*1.5);
        }
        return pay;
    }

    @Override
    public String toString() {
        return employee.toString() + " " + employee.getId() + " " + pay;
    }
}
