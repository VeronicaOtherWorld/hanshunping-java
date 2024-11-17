package com.homework;

public class Homework04 {
    public static void main(String[] args) {
        Employee manager = new Manager("tina",100.0, 20);
        Employee staff = new Staff("sara", 100.0, 20);
        System.out.println(manager.print());
        System.out.println(staff.print());
    }
}
class Employee {
    private String name;
    private double daySalary, salary;
    private int workDay;

    public Employee() {

    }


    public Employee(String name, double daySalary, int workDay) {
        this.name = name;
        this.daySalary = daySalary;
        this.workDay = workDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    public double calSalary(){
        salary = daySalary * workDay;
        return salary;
    }
    public String print(){
       return "name " + name + " workDay " + workDay;
    }
}

class Manager extends Employee {
    private final double level = 1.2;
    private final int baseSalary = 1000;

    public Manager(String name, double daySalary, int workDay) {
        super(name, daySalary, workDay);
    }
    @Override
    public String print(){
        return super.print() + " salary " + (super.calSalary() * level+ baseSalary) ;
    }

}

class Staff extends Employee {
    private final double level = 1.0;

    public Staff(String name, double daySalary, int workDay) {
        super(name, daySalary, workDay);
    }
    @Override
    public String print(){
        return super.print() + " salary " + (super.calSalary() * level);
    }
}