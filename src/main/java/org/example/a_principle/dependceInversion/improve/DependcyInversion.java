package org.example.a_principle.dependceInversion.improve;

public class DependcyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiChat());
    }

}

interface IReceiver{
    String getInfo();
}

class Email implements IReceiver{

    public String getInfo(){
        return "Email:hello world";
    }

}

class WeiChat implements IReceiver{
    public String getInfo() {
        return "WeiChat:hello world";
    }
}
class Person{

    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }

}
