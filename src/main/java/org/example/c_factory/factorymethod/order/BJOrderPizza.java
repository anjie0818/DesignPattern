package org.example.c_factory.factorymethod.order;

import org.example.c_factory.factorymethod.pizza.BJCheesePizza;
import org.example.c_factory.factorymethod.pizza.BJGreekPizza;
import org.example.c_factory.factorymethod.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
