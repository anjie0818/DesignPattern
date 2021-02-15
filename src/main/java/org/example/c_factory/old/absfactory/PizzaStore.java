package org.example.c_factory.old.absfactory;

public class PizzaStore {

    public static void main(String[] args) {
        new OrderPizza(new LDFactory());
    }
}
