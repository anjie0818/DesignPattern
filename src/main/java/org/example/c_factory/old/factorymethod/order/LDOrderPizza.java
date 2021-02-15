package org.example.c_factory.old.factorymethod.order;

import org.example.c_factory.old.factorymethod.pizza.*;

public class LDOrderPizza extends OrderPizza {

    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new LDGreekPizza();
        }
        return pizza;
    }
}
