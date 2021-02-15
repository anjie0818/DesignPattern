package org.example.e_builder.improve;

public class CommonHouse extends HouseBuilder {

    private House house = new House(); //子类设置属性

    void buildBasic() {
        house.setBasic("CommonHouse-buildBasic");
        System.out.println("CommonHouse-buildBasic");
    }

    void buildWalls() {
        house.setWalls("CommonHouse-buildWalls");
        System.out.println("CommonHouse-buildWalls");
    }

    void roofed() {
        house.setRoof("CommonHouse-roofed");
        System.out.println("CommonHouse-roofed");
    }

    House buildHouse() {
        return house;
    }
}
