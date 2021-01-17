package org.example.a_principle.singleResponsibility;

public class SinglerResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");

        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
    }
}
//交通工具类
//方式二
// 1.遵守单一职责原则
// 2.但是这样的改动很大，即将类分解，同时修改客户端

class RoadVehicle{

    public void run(String vehicle){
        System.out.println(vehicle+" 在公路上运行。。。");
    }
}
class WaterVehicle{

    public void run(String vehicle){
        System.out.println(vehicle+" 在水面上运行。。。");
    }
}
class AirVehicle{

    public void run(String vehicle){
        System.out.println(vehicle+" 在天空中运行。。。");
    }
}