package org.example.e_builder.improve;

public class Client {

    public static void main(String[] args) {

        CommonHouse commonHouse = new CommonHouse();
        HouseDirector director = new HouseDirector(commonHouse);
        House house1 = director.constructHouse();
        System.out.println(house1);
        System.out.println("----------------");
        HighBuildingHouse highBuildingHouse = new HighBuildingHouse();
        director.setHouseBuilder(highBuildingHouse);
        House house2 = director.constructHouse();
        System.out.println(house2);
    }
}
