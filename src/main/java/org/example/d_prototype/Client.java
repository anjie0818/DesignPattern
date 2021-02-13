package org.example.d_prototype;

public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        //传统方法
        Sheep copy1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep copy2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep copy3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep copy4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep copy5 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        // ...
        System.out.println(sheep);
        System.out.println(copy1);
        System.out.println(copy2);
        System.out.println(copy3);
        System.out.println(copy4);
        System.out.println(copy5);


    }
}
