package org.example.c_factory.simplefactory.order;

import org.example.c_factory.simplefactory.pizza.CheesePizza;
import org.example.c_factory.simplefactory.pizza.GreekPizza;
import org.example.c_factory.simplefactory.pizza.PepperPizza;
import org.example.c_factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    /**
     * 传统方式
     * 优点：比较好理解，简单易操作
     * 缺点：违反类设计模式的ocp原则，对扩展开放，对修改关闭
     */
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("greek");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("cheese");
            } else if (orderType.equals("pepper")) {
                pizza = new PepperPizza();
                pizza.setName("pepper");
            } else {
                System.out.println("没有这种Pizza");
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
