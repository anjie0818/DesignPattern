package org.example.c_factory.simplefactory.order;

import org.example.c_factory.simplefactory.pizza.CheesePizza;
import org.example.c_factory.simplefactory.pizza.GreekPizza;
import org.example.c_factory.simplefactory.pizza.PepperPizza;
import org.example.c_factory.simplefactory.pizza.Pizza;

/**
 * 简单工厂模式 也叫 静态工厂模式
 */
public class SimpleStaticFactory {

    public static Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("Greek");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("cheese");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("pepper");
        }
        return pizza;
    }

}
