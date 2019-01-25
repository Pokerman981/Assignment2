package me.troyg.assignment2;

import me.troyg.assignment2.Object.Employee;

import javax.swing.*;

public class Commission implements Payroll {
    private double pay = 0;
    private double commissionRate;
    private double sales;
    private Employee employee = new Employee();

    public Commission(String empNumber, String empName, double commissionRate) {
        employee.setId(empNumber);
        employee.setName(empName);
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
        return employee.toString() + " " + employee.getId() + " " + pay;
    }
}
