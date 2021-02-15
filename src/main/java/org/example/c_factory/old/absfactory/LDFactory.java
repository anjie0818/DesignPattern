package org.example.c_factory.old.absfactory;

import org.example.c_factory.old.factorymethod.pizza.LDCheesePizza;
import org.example.c_factory.old.factorymethod.pizza.LDGreekPizza;
import org.example.c_factory.old.factorymethod.pizza.Pizza;

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
