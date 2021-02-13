package org.example.d_prototype.improve;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep1 = new Sheep("tom", 12, "red");
        sheep1.friend = new Sheep("friend", 10, "yellow");

        Sheep sheep2 = (Sheep) sheep1.clone();
        Sheep sheep3 = (Sheep) sheep1.clone();
        Sheep sheep4 = (Sheep) sheep1.clone();
        Sheep sheep5 = (Sheep) sheep1.clone();
        System.out.println(sheep1 + "->sheep.friend=" + sheep1.friend.hashCode());
        System.out.println(sheep2 + "->sheep.friend=" + sheep2.friend.hashCode());
        System.out.println(sheep3 + "->sheep.friend=" + sheep3.friend.hashCode());
        System.out.println(sheep4 + "->sheep.friend=" + sheep4.friend.hashCode());
        System.out.println(sheep5 + "->sheep.friend=" + sheep5.friend.hashCode());

    }
}
