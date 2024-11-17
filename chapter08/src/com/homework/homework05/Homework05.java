package com.homework.homework05;



public class Homework05 {
    public static void main(String[] args) {
        Employee1 worker = new Worker();
        worker.print();
        // 向下转型就是强制把指向子类的父类变量“还原”为子类类型
        Worker worker1 = (Worker)worker;
        worker1.print();
        Employee1 farmer = new Farmer();
//        farmer.print();
        Farmer farmer1 = (Farmer)farmer;
        farmer1.print();
        Employee1 teacher = new Teacher1(200, 100);
//        Employee1 teacher1 = (Teacher1)teacher;
        teacher.print();
        Employee1 scientist = new Scientist(20000);
        scientist.print();
        Employee1 Waitress = new Waitress();
        Waitress.print();
    }
}

class Employee1 {
    private final int baseSalary = 1000;
    private int salaryMonth = 12;

    public Employee1() {
    }

    public int getBaseSalary() {
        return baseSalary;
    }
    public void print(){
        System.out.println("baseSalary = " + baseSalary * salaryMonth);
    }
}

class Worker extends Employee1 {
    public Worker() {
    }
}

class Farmer extends Employee1 {


}
class Waitress extends Employee1 {


}

class Teacher1 extends Employee1 {
    private int workDay;
    private int classFee;
    public Teacher1(int classFee, int workDay) {
        this.classFee = classFee;
        this.workDay = workDay;
    }
    public void print() {
        System.out.println( "teacher" + (this.getBaseSalary() + (workDay * classFee)));
    }
}

class Scientist extends Employee1 {
    private int finalSalary;

    public Scientist(int finalSalary) {
        this.finalSalary = finalSalary;
    }
    public void print() {
        System.out.println( "scientist" + (this.getBaseSalary() + finalSalary));
    }
}

