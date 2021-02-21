package org.example.c_factory.old.factorymethod.pizza;

public abstract class Pizza {

    protected String name;

    public abstract void prepare();

    public void bake() {
        System.out.println(name + "baking...");
    }

    public void cut() {
        System.out.println(name + "cut...");
    }

    public void box() {
        System.out.println(name + "box...");
    }

    public void setName(String name) {
        this.name = name;
    }
}
