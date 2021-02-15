package org.example.e_builder.improve;

public class HighBuildingHouse extends HouseBuilder {
    private House house = new House(); //子类设置属性

    void buildBasic() {
        house.setBasic("HighBuildingHouse-buildBasic");
        System.out.println("HighBuildingHouse-buildBasic");
    }

    void buildWalls() {
        house.setWalls("HighBuildingHouse-buildWalls");
        System.out.println("HighBuildingHouse-buildWalls");
    }

    void roofed() {
        house.setRoof("HighBuildingHouse-roofed");
        System.out.println("HighBuildingHouse-roofed");
    }

    House buildHouse() {
        return house;
    }
}
