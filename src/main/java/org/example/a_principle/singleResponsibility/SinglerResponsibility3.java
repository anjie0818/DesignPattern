package org.example.a_principle.singleResponsibility;

public class SinglerResponsibility3 {
    public static void main(String[] args) {
        Vehicle3 vehicle = new Vehicle3();
        vehicle.run("摩托车");
        vehicle.airRun("飞机");
        vehicle.waterRun("轮船");
    }
}
//交通工具类
//方式三
// 1.这种修改方法没有对原来的类做很大的修改，只是增加方法
// 2.这里虽然在类这个级别上不符合单一职责，但是在方法级别上，仍然遵守单一职责

class Vehicle3{

    public void run(String vehicle){
        System.out.println(vehicle+" 在公路上运行。。。");
    }

    public void waterRun(String vehicle){
        System.out.println(vehicle+" 在水上运行。。。");
    }
    public void airRun(String vehicle){
        System.out.println(vehicle+" 在天空中飞行。。。");
    }
}