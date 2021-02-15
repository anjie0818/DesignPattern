package org.example.c_factory.old.simplefactory.order;

import java.util.Calendar;

//相当于一个客户点，发出订购
public class PizzaStore {

    public static void main(String[] args) {
//        传统方法
//        new OrderPizza();
//        使用简单工厂
        new OrderPizza2(new SimpleFactory());
        Calendar c = Calendar.getInstance();
    }
}
