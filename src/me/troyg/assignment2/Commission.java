package me.troyg.assignment2;

import me.troyg.assignment2.Object.Employee;

public class Commission implements Payroll {
    private double pay = 0;
    private double commissionRate = 0;
    private double sales;
    private Employee employee = new Employee();

    public Commission(String empNumber, String empName, double commissionRate) {
        employee.setId(empNumber);
        employee.setName(empName);
        this.commissionRate = commissionRate;

    }

    @Override
    public void setPayPeriodDetails() {
        sales = 15;
        calculatePay();
    }

    @Override
    public double calculatePay() {
        pay = sales * commissionRate;
        return pay;
    }

    @Override
    public String toString() {
        return employee.toString() + getClass().getTypeName() + employee.getId() + pay;
    }
}
