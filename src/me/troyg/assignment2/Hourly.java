package me.troyg.assignment2;

public class Hourly implements Payroll {

    Employee employee = new Employee();
    private double hoursWorked = 0;
    private double rate = 0;
    private double pay;

    public Hourly(String empNumber, String name, double rate) {
        employee.setId(empNumber);
        employee.setName(name);
        this.rate = rate;
    }

    @Override
    public void setPayPeriodDetails() {
        hoursWorked = 45;
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
