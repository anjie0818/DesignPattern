package org.example.b_singleton.g_懒汉式_线程安全_静态内部类;

public class SingletonTest07 {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}

/**
 * 懒汉式 静态内部类
 * <p>
 * 优点：
 * 懒加载
 * 线程安全
 * 效率高
 * 实际开发建议使用
 */
class Singleton {

    //构造方法私有画
    private Singleton() {
    }

    private static Singleton instance;

    /**
     * 懒加载实现原理：
     * 静态内部类 SinletonInstance 在 Singleton 类加载时不会被加载
     * 懒加载实现原理：
     * jvm在进行类加载时候是线程安全的，利用jvm此特性满足线程安全
     */
    private static class SinletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    //提过一个静态的公有方法，直接返回 SinletonInstance.INSTANCE
    public static Singleton getInstance() {
        return SinletonInstance.INSTANCE;
    }
}
