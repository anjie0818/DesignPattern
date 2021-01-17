package org.example.a_principle.interfaceSegregation.improve;

public class Segregation2 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());

    }
}
interface  Interface1{
    void operation1();
}
interface Interface2{
    void operation2();
    void operation3();
}
interface Interface3{
    void operation4();
    void operation5();
}
class B implements Interface1,Interface2{
    public void operation1() {
        System.out.println("B implement operation1");
    }

    public void operation2() {
        System.out.println("B implement operation2");

    }

    public void operation3() {
        System.out.println("B implement operation3");

    }
}
class D implements Interface1,Interface3{

    public void operation1() {
        System.out.println("D implement operation1");

    }

    public void operation4() {
        System.out.println("D implement operation4");

    }

    public void operation5() {
        System.out.println("D implement operation5");

    }
}
class A{
    public void depend1(Interface1 interface1){
        interface1.operation1();
    }
    public void depend2(Interface2 interface2){
        interface2.operation2();
    }
    public void depend3(Interface2 interface2){
        interface2.operation3();
    }
}
class C{
    public void depend1(Interface1 interface1){
        interface1.operation1();
    }
    public void depend4(Interface3 interface3){
        interface3.operation4();
    }
    public void depend5(Interface3 interface3){
        interface3.operation5();
    }
}