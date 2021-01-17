package org.example.a_principle.interfaceSegregation;

public class Segregation1 {

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

interface Interface1{

    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface1{
    public void operation1() {
        System.out.println("B implement operation1");
    }

    public void operation2() {
        System.out.println("B implement operation2");

    }

    public void operation3() {
        System.out.println("B implement operation3");

    }

    public void operation4() {
        System.out.println("B implement operation4");

    }

    public void operation5() {
        System.out.println("B implement operation5");

    }
}
class D implements Interface1{
    public void operation1() {
        System.out.println("D implement operation1");
    }

    public void operation2() {
        System.out.println("D implement operation2");

    }

    public void operation3() {
        System.out.println("D implement operation3");

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
    public void depend2(Interface1 interface1){
        interface1.operation2();
    }
    public void depend3(Interface1 interface1){
        interface1.operation3();
    }
}
class C{
    public void depend1(Interface1 interface1){
        interface1.operation1();
    }
    public void depend4(Interface1 interface1){
        interface1.operation4();
    }
    public void depend5(Interface1 interface1){
        interface1.operation5();
    }
}