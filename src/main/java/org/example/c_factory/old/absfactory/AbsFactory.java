package org.example.c_factory.old.absfactory;

import org.example.c_factory.old.factorymethod.pizza.Pizza;

//一个抽象工厂模式的抽象层(接口)
public abstract class AbsFactory {

    //让下面的工厂子类来 具体的实现
    public abstract Pizza createPizza(String orderType);

}

