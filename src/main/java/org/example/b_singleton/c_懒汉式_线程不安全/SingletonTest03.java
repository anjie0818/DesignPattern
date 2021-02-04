package org.example.b_singleton.c_懒汉式_线程不安全;

public class SingletonTest03 {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}

/**
 * 懒汉式（线程不安全）
 * <p>
 * 优点：
 * 懒加载
 * 缺点：
 * 多线程不安全
 * 实际开发不可用
 */
class Singleton {

    //构造方法私有画
    private Singleton() {
    }

    //本类内部创建对象
    private static Singleton instance;

    //提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
