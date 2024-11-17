package com.Homework13;

public class Homework13 {
    public static void main(String[] args) {
        Person temp;
        Person[] persons = new Person[4];
        persons[0] = new Student("andy s", 'f',31, 1,"running" );
        persons[1] = new Student("jane s", 'm',20, 2,"swimming" );
        persons[2] = new Teacher("lisa t", 'f',42, 3,"dancing" );
        persons[3] = new Teacher("zina t", 'f',55, 4,"laughing" );
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if(persons[j].getAge() < persons[j + 1].getAge()) {
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
        Homework13 homework13 = new Homework13();

        // 输出排序后的结果
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
            homework13.call(persons[i]);
            System.out.println(persons[i].print());
        }


    }
    public void call(Person person) {
        if(person instanceof Student) {
            ((Student) person).study();
        }else if(person instanceof Teacher) {
            ((Teacher)person).teach();
        }
    }
}
class Person {
    private String name, hobby;
    private char gender;
    private int age;

    public Person() {
    }

    public Person(String name, char gender, int age, String hobby) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", hobby='" + hobby + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String hobby() {
        return name + " like playing " + hobby;
    }
    public String print() {
        return "name: " + name +  "\n" +
                "gender: " + gender + "\n" +
                "age: " + age + "\n";
    }

}

class Student extends Person {

    private int id;

    public Student() {
    }

    public Student(String name, char gender, int age, int id, String hobby) {
        super(name, gender, age, hobby);
        this.id = id;
    }
    public void study(){
        System.out.println("Student is studying");
    }
    public String hobby(String hobby) {
        return super.getName() + "likes playing " + hobby;
    }
    public String print(){
        return super.print() +
                " " + hobby() + "\n" +
                "student id: " + this.id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}' + super.toString();
    }
}


class Teacher extends Person {
    private int workYears;

    public Teacher() {
    }

    public Teacher(String name, char gender, int age, int workYears, String hobby) {
        super(name, gender, age, hobby);
        this.workYears = workYears;
    }
    public String hobby(String hobby) {
        return super.getName() + "likes playing " + hobby;
    }
    public void teach(){
        System.out.println("i will teach hard.");
    }
    public String print(){
        return super.print() +
                " " + hobby() + "\n" +
                "work years: " + this.workYears;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "workYears=" + workYears +
                '}' + super.toString();
    }
}