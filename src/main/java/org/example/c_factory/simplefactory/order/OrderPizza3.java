package org.example.c_factory.simplefactory.order;

import org.example.c_factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza3 {

    Pizza pizza = null;

    /**
     * 使用简单工厂创建对象
     */
    public OrderPizza3() {
        setSimpleFactory();
    }

    public void setSimpleFactory() {
        String orderType = "";
        do {
            orderType = getType();
            // 使用静态工厂
            pizza = SimpleStaticFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("没有这种Pizza");
                break;
            }
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
