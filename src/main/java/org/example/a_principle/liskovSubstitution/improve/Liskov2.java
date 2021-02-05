package org.example.a_principle.liskovSubstitution.improve;

public class Liskov2 {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.func1(11, 22));
        System.out.println("-----------");
        B b = new B();
        System.out.println(b.func1(11, 22));
        System.out.println(b.func2(11, 22));
        System.out.println(b.dependAFun1(11, 22));

    }
}

//创建一个更加基础的基类
class Base {
    //把更加基础的方法和成员写到Base类
}

class A extends Base {
    //返回来个数的差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

class B extends Base {

    //如果B需要A的方法，使用组合关系
    private A a = new A();

    
    public int func1(int num1, int num2) {
        return num1 + num2;
    }

    public int func2(int num1, int num2) {
        return num1 * num2;
    }

    public int dependAFun1(int num1, int num2) {
        return a.func1(num1, num2);
    }
}
