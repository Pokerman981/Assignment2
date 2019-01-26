package me.troyg.assignment2;

import me.troyg.assignment2.Object.Employee;

import javax.swing.*;

public class Commission extends Employee implements Payroll {
    private double pay = 0;
    private double commissionRate;
    private double sales;

    public Commission(String empNumber, String empName, double commissionRate) {
        this.setId(empNumber);
        this.setName(empName);
        this.commissionRate = commissionRate;
    }

    @Override
    public void setPayPeriodDetails() {
        sales = Integer.valueOf(JOptionPane.showInputDialog("Enter how many sales there were\n for the current pay period"));
        calculatePay();
    }

    @Override
    public double calculatePay() {
        pay = sales * commissionRate;
        return pay;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.getId() + " " + this.pay;
    }
}
