package org.example.c_factory.old.simplefactory.order;

import org.example.c_factory.old.simplefactory.pizza.CheesePizza;
import org.example.c_factory.old.simplefactory.pizza.GreekPizza;
import org.example.c_factory.old.simplefactory.pizza.PepperPizza;
import org.example.c_factory.old.simplefactory.pizza.Pizza;

/**
 * 简单工厂模式是属于创建型模式，是工厂模式的一种
 * 简单工厂模式是由一个工厂对象决定创建出那种产品类的实例
 * <p>
 * 本质：定义一个创建对象的类，由这个类来封装实例化对象的行为
 * <p>
 * 使用场景：当我们会用到大量的创建某种/某类/某批对象时，会使用工厂模式
 */
public class SimpleFactory {

    public Pizza createPizza(String orderType) {
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
