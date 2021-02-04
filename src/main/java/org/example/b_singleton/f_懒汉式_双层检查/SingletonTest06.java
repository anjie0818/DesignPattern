package org.example.b_singleton.f_懒汉式_双层检查;

public class SingletonTest06 {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}

/**
 * 懒汉式（双重检查）
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

    /**
     * volatile 保证对象发生变化，立即更新主存
     * 变量声明为volatile类型后，编译器与运行时都会注意到这个变量是共享的，
     * 因此不会将该变量上的操作与其他内存操作一起重排序。volatile变量不会
     * 被缓存在寄存器或者对其他处理器不可见的地方，因此在读取volatile类型
     * 的变量时总会返回最新写入的值。
     */
    private static volatile Singleton instance;

    /**
     * 加入双重检查
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
