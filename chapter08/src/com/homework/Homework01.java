package com.homework;

/*定义一个person类, name,job, age,
初始化一个person对象数组,有三个person对象,
按照age从大到小排序
冒泡排序
*/
public class Homework01 {
    public static void main(String[] args) {
        Person temp;
        Person[] persons = new Person[3];
        persons[0] = new Person("adam", 10, "writer");
        persons[1] = new Person("bob", 20, "driver");
        persons[2] = new Person("cindy", 30, "dancer");
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if(persons[j].age < persons[j + 1].age){
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
    }
}

class Person {
    private String name;
    public int age;
    private String job;
    public Person() {

    }
    public Person(String name, int age, String job) {
        this.age = age;
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}