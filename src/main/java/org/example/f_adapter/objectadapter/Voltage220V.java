package org.example.f_adapter.objectadapter;

//被适配的类
public class Voltage220V {
    //输出220v的电压
    public int output220V() {
        int src = 220;
        System.out.println("src 电压=" + src + "伏");
        return src;
    }
}
