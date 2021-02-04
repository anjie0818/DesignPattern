package org.example.b_singleton.h_枚举;

public class SingletonTest08 {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        singleton1.sayOk();
        singleton2.sayOk();
    }
}

/**
 * 枚举
 * 优点：
 * 线程安全，防止反序列化重新创建对象
 * <p>
 * 实际开发推荐使用
 */
enum Singleton {
    INSTANCE;

    public String sayOk() {
        return "ok...";
    }
}
