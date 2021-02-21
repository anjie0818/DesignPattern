package org.example.c_factory.old.factorymethod.pizza;

public class BJCheesePizza extends Pizza {
    public void prepare() {
        setName("北京 奶酪披萨 ");
        System.out.println("北京 给奶酪披萨 准备原材料");
    }
}
