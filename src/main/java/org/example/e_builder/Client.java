package org.example.e_builder;

public class Client {

    public static void main(String[] args) {

        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
        HighBuildingHouse highBuildingHouse = new HighBuildingHouse();
        highBuildingHouse.build();

        StringBuilder bu = new StringBuilder();
    }
}
