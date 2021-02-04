package org.example.b_singleton.d_懒汉式_线程安全_同步方法;

public class SingletonTest04 {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}

/**
 * 懒汉式（线程安全->同步方法）
 * <p>
 * 优点：
 * 懒加载
 * 线程安全
 * 缺点：
 * 效率低，getInstance方法在多次调用时，都要同步等待
 * 实际开发中不推荐使用，效率低
 */
class Singleton {

    //构造方法私有画
    private Singleton() {
    }

    //本类内部创建对象
    private static Singleton instance;

    // synchronized
    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
