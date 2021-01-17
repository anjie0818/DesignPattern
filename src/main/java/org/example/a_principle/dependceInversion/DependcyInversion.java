package org.example.a_principle.dependceInversion;

public class DependcyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{

    public String getInfo(){
        return "Email:hello world";
    }

}

/**
 * 方式一分析：
 *  1.简单，易实现
 *  2.如果接收的是微信，短信。。。，需要新增类，person需要新增方法
 *  3.解决方法：引入IReceiver接口
 */
class Person{

    public void receive(Email email){
        System.out.println(email.getInfo());
    }

}
