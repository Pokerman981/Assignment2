package me.troyg.assignment2;

public class Hourly implements Payroll {

    Employee employee = new Employee();

    public Hourly() {
        employee.setId("0001");
        employee.setName("TroyG");
    }

    @Override
    public void setPayPeriodDetails() {

    }

    @Override
    public double calculatePay() {
        return 0;
    }
}
