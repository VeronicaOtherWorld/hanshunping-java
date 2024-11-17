package com.homework;
// 编写老师类,有姓名,年龄,职称,基本工资
//introduce 介绍信息


//子类,教授,副教授,讲师
//重写introduce方法
public class Homework03 {
    public static void main(String[] args) {
        Teacher prof = new Prof("mingming", 60, "phd", 1000);
        Teacher associate = new AssociateProf("shushu", 50, "associate",1000);
        Teacher lecturer = new Lecturer("jinjin", 40, "lecturer", 1000);
        prof.introduce();
        associate.introduce();
        lecturer.introduce();
    }
}

class Teacher {
    private String name;
    private int age;
    private String title;
    private int salary;

    public Teacher() {
    }

    public Teacher(String name, int age, String title, int salary) {
        this.salary = salary;
        this.title = title;
        this.age = age;
        this.name = name;
    }
    public void introduce() {
        System.out.println("name " + name + "age " + age + "salary " + salary);
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class Prof extends Teacher {
    public Prof(String name, int age, String title, int salary) {
        super(name, age, title,salary);
    }
    public void introduce() {
        System.out.println("name " + getName() + "age " +
                getAge() + "salary " + (getSalary() * 1.3));
    }
}
class AssociateProf extends Teacher {
    public AssociateProf(String name, int age, String title, int salary) {
        super(name, age, title,salary);
    }
    public void introduce() {
        System.out.println("name " + getName() + "age " +
                getAge() + "salary " + (getSalary() * 1.2));
    }
}
class Lecturer extends Teacher {
    public Lecturer(String name, int age, String title, int salary) {
        super(name, age, title,salary);
    }
    public void introduce() {
        System.out.println("name " + getName() + "age " +
                getAge() + "salary " + (getSalary() * 1.1));
    }
}

