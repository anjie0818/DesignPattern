package org.example.b_singleton.a_饿汉式_静态变量;

public class SingletonTest01 {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}

/**
 * 饿汉式（静态常量）
 * <p>
 * 优点：写法简单
 * 在类装载的时候就完成实例化。避免线程同步的问题
 * 缺点：类装载时候实例化，没有达到lazy loading的效果。
 * 如果对象不被调用，造成内存资源浪费
 */
class Singleton {

    //构造方法私有画
    private Singleton() {

    }

    //本类内部创建对象
    private final static Singleton instance = new Singleton();

    //提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
