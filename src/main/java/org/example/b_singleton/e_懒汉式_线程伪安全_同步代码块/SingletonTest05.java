package org.example.b_singleton.e_懒汉式_线程伪安全_同步代码块;

public class SingletonTest05 {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}

/**
 * 懒汉式（线程伪安全->同步代码块）
 * <p>
 * 优点：
 * 懒加载
 * 缺点：
 * 效率低，getInstance方法在多次调用时，都要同步等待
 * 同步代码块，在多线程调用时无法解决多线程new不同对象的问题
 * 实际开发中不使用
 */
class Singleton {

    //构造方法私有画
    private Singleton() {
    }

    //本类内部创建对象
    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
