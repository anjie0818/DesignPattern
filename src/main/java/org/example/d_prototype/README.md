## 原型模式
### 克隆羊问题
现在有一只羊tom，姓名为tom，年龄为1，颜色为白色，编写程序创建和tom羊属性完全相同的10只羊
### 传统解法
```bash
        Sheep sheep = new Sheep("tom",1,"白色");
        //传统方法
        Sheep copy1 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep copy2 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep copy3 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep copy4 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep copy5 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        // ...
        System.out.println(sheep);
        System.out.println(copy1);
        System.out.println(copy2);
        System.out.println(copy3);
        System.out.println(copy4);
        System.out.println(copy5);
```
#### 优缺点
* 优点是比较好理解，简单易操作
* 缺点
    * 创建对象时，需要重新获取原始对象的属性，如果对象属性较复杂，效率低
    * 需要重新初始化对象，而不是动态的获得对象运行时状态，不够灵活
* 改进思路
    * Java中的Object类是所有类的跟类，Object提供了一个clone方法，可以复制java对象，但是需要实现Cloneable接口    
        * Cloneable该接口表示该类能够复制且具有复制的能力->原型模式
### 原型模式（protoytpe）
### 深入讨论-浅拷贝和深拷贝
#### 浅拷贝的介绍
* 对于基本数据类型的成员变量，浅拷贝会直接进行值传递，也就是该属性值复制一份给新的对象
* 对于数据类型是引用数据类型的成员变量，eg 数组、类对象，浅拷贝会进行引用传递，也就是只是将该成员变量的引用值（内存地址）复制一份给一个新的对象。因为实际指向同一个实例
#### 深拷贝的介绍
* 复制对象的所有基本树立类型的成员变量值
* 对象进行深拷贝要对整个对象（包括对象的引用类型）进行拷贝
* 实现方式：
    * 重写clone方法
    * 对象序列化进行深拷贝（推荐）
