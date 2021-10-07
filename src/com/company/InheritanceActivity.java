package com.company;

import java.text.NumberFormat;

public class InheritanceActivity {

    public static void main(String[] args) {

        Employee employee1 = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
        System.out.println("Manager salary is " + NumberFormat.getCurrencyInstance().format(employee1.calculateSalary()));

        Employee employee2 = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
        System.out.println("Trainee salary is " + NumberFormat.getCurrencyInstance().format(employee2.calculateSalary()));

        System.out.println("Manager transport allowance is " + NumberFormat.getCurrencyInstance().format(employee1.calculateTransportAllowance()));
        System.out.println("Trainee transport allowance is " + NumberFormat.getCurrencyInstance().format(employee2.calculateTransportAllowance()));
    }
}
