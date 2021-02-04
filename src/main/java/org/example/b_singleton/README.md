## 单例设计模式介绍
采用一定的方法保证在整个软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法（静态方法）
    
eg：Hibernate的 SessionFactory，它充当数据存储源的代理，并负责创建session对象。   
SessionFactory不是轻量级的，一般情况下，一个项目通常只需要一个SessionFactory，这里会用到单利模式
## 八种单例
饿汉式都是线程安全的   
详见代码
## JDK源码分析
```java
public class Runtime {
    private static Runtime currentRuntime = new Runtime();

    /**
     * Returns the runtime object associated with the current Java application.
     * Most of the methods of class <code>Runtime</code> are instance
     * methods and must be invoked with respect to the current runtime object.
     *
     * @return  the <code>Runtime</code> object associated with the current
     *          Java application.
     */
    public static Runtime getRuntime() {
        return currentRuntime;
    }

    /** Don't let anyone else instantiate this class */
    private Runtime() {}
}
```
## 单例模式注意事项和细节说明
* 对于频繁创建和销毁的对象，建议使用单例，提高性能
    * 重量级对象（创建对象耗时过多或者资源耗费较多）而且经常使用的对象
    * 工具类对象
    * 频繁访问数据库或者文件的对象 eg：数据源，session工厂等
* 单例模式获取对象不是new，而是静态方法