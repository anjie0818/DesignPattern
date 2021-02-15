package org.example.c_factory.old.absfactory;

import org.example.c_factory.old.factorymethod.pizza.*;

public class BJFactory extends AbsFactory {
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
