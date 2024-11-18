package com.interface_.interface02;

// 1.接口不能被实例化
public interface Interface02 {
//     declare attribute
    public int n1 = 10;
//     2.接口中所有的方法都是public方法,抽象方法可以不用abstract修饰
//     declare method
//     1️⃣抽象方法
//     在接口中,抽象方法,可以省略abstract keyword
    public void print();
//     2️⃣也可以写默认实现方法
//     需要使用 default keyword 修饰
    default public void ok(){
        System.out.println("okayy");
    }
//     3️⃣或者写 静态方法
    public static void ok2(){
        System.out.println("okayy2");
    }

}

class AA implements Interface02 {
    @Override
    public void print() {
        System.out.println("print hi");
    }
}

interface Animal {
    public void eat();
}
interface Fur {}


// 8. interface can not extend other class
// but can extend other interface(many)

// 9.接口的修饰符只能是public 或者默认
// 如果是public,就要放到别的class文件里去
interface Cat extends Animal, Fur {
   //  6.the attribute in the interface, only can be final
   //  public static final

   //  7.the way to visit the attribute in the interface
   //  syntax: interface name.attribute name
   int n1 = 10;
   void howl();

}

interface Dog {
    void say();
}


// 3.一个普通类实现接口,就必须将接口的所有方法都实现
// 5.one class can implement many interface
class BB implements Cat,Dog {
    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void howl() {
        System.out.println("howl");
    }

    @Override
    public void say() {
        System.out.println("say");
    }
}
// 4.abstract class implements interface
// not have to implement all the methods in the interface
abstract class CC implements Animal {

}
