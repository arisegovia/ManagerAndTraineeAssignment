package com.company;

public class Manager extends Employee{

    //constructors
    public Manager(long id, String name, String address, long phone, double salary) {
        super(id, name, address, phone, salary);
    }

    //methods
    @Override
    public double calculateTransportAllowance() {
        double transportAllowance = (15D / 100D) * this.basicSalary;
        return transportAllowance;
    }
}
