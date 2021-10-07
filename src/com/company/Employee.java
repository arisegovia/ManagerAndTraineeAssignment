package com.company;

public class Employee {

    //fields
    private long employeeId;
    private String employeeName;
    private String employeeAddress;
    private long employeePhone;
    protected double basicSalary;
    private final double SPECIAL_ALLOWANCE = 250.80;
    private final double HRA = 1000.50;

    //constructors
        //default constructor
    public Employee() {
    }

    public Employee(long id, String name, String address, long phone, double salary) {
        this.employeeId = id;
        this.employeeName = name;
        this.employeeAddress = address;
        this.employeePhone = phone;
        this.basicSalary = salary;
    }

    //methods
    public double calculateSalary(){
        double salary = basicSalary + (basicSalary * (SPECIAL_ALLOWANCE/100)) + (basicSalary * (HRA/100));
        return salary;
    }

    public double calculateTransportAllowance(){
        double transportAllowance = (10D / 100D) * basicSalary;
        return transportAllowance;
    }
}
