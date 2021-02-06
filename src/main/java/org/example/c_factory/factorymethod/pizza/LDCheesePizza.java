package org.example.c_factory.factorymethod.pizza;

public class LDCheesePizza extends Pizza {
    public void prepare() {
        setName("伦敦 奶酪披萨 ");
        System.out.println("伦敦 给奶酪披萨 准备原材料");
    }
}
