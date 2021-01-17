package org.example.a_principle.singleResponsibility;

public class SinglerResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("飞机");
        vehicle.run("轮船");
    }
}
//交通工具类
//方式一
// 1.方式一的run方法中，违反了单一职责原则
// 2.解决方法，根据交通工具的不同分解为不同的类

class Vehicle{

    public void run(String vehicle){
        System.out.println(vehicle+" 在公路上运行。。。");
    }
}