package com.homework.HomeWork10;

import java.util.Objects;

public class HomeWork10 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("jaja", 20, "teacher", 2000);
        Doctor doctor1 = new Doctor("kaja", 20, "teacher", 2000);
        System.out.println(doctor.equals(doctor1));


    }

}

class Doctor {
    private String name;
    private int age;
    private String job;
    private double salary;

    public Doctor(String name, int age, String job, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return age == doctor.age && Double.compare(salary, doctor.salary) == 0 && Objects.equals(name, doctor.name) && Objects.equals(job, doctor.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, job, salary);
    }
}