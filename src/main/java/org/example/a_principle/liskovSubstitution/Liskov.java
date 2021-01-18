package org.example.a_principle.liskovSubstitution;

public class Liskov {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.func1(11, 22));
        System.out.println("-----------");
        B b = new B();
        System.out.println(b.func1(11, 22));//本意是求减法，解决方法：原来的父类和子类都继承一个更通俗的基类，把原有的继承关系去掉，采用依赖、聚合、组合等关系替代
        System.out.println(b.func2(11, 22));
    }
}

class A {
    //返回来个数的差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

class B extends A {

    //这里重写A类的方法，可能是无意识的
    public int func1(int num1, int num2) {
        return num1 + num2;
    }

    public int func2(int num1, int num2) {
        return num1 * num2;
    }
}