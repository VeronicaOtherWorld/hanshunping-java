package com.override;

public class OverrideExecise {
    public static void main(String[] args) {
        Person person = new Person("mizi", 20);
        System.out.println(person.say());
        Student student = new Student("lili", 20, 1, 95);
        System.out.println(student.say());
    }
}
class Person {
    private String name;
    private int age;
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String say(){
        return "hello" + name + age;
    }

}

class Student extends Person {
    private int score;
    private int id;

    public Student() {
    }

    public Student(String name, int age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say(){
    // 代码复用
        return super.say() + id + score;
    }
}
