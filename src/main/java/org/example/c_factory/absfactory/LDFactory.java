package org.example.c_factory.absfactory;

import org.example.c_factory.factorymethod.pizza.LDCheesePizza;
import org.example.c_factory.factorymethod.pizza.LDGreekPizza;
import org.example.c_factory.factorymethod.pizza.Pizza;

public class LDFactory extends AbsFactory {
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new LDGreekPizza();
        }
        return pizza;
    }
}
