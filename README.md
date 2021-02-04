## 1.设计模式的目的
设计模式为了让程序（软件）具有更好的   
1>代码重用性：相同功能的代码，不用多次编写   
2>可读性：编程规范性，便于其他程序员阅读和理解   
3>可扩展性：增加新的功能，非常方便，可维护性   
4>可靠性：增加新的功能，对原来的功能没有影响   
5>使程序呈现高内聚，低耦合的特性   
   分享金句
6>设计模式包含了面向对象的精髓，懂了设计模式，就懂了面向对象分析和设计的精要   
7>Scott Maryers 在《Effective C++》就说过：C++老手和C++新手的区别就是前者手背上有很多的伤疤
## 2.设计模式七大原则
### <一>单一职责原则
#### 基本介绍
一个类应该只负责一项职责。如类A负责两个不同职责：职责1，职责2。当职责1需求变更而改变A时，可能造成职责2执行错误，所以需要将类A的粒度分解为A1，A2
#### 单一职责原则注意事项和细节
* 降低类的复杂度，一个类只负责一项职责
* 提高类的可读性，可维护性
* 降低变更引起的风险
* 通常情况下，我们应该遵守单一职责原则，只有逻辑足够简单，才可以代码级别违反单一职责原则；只有类中的方法数量足够少，可以在方法级别保持单一职责原则
### <二>接口隔离原则
#### 基本介绍
客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上
### <三>依赖倒转（倒置）原则
#### 基本介绍
依赖倒转原则（Dependence Inversion Principle）是指：
* 高层模块不应该一列低层模块，二者都应该依赖其抽象
* 抽象不应该依赖细节，细节应该依赖抽象
* 依赖倒转的中心思想是面向接口编程
* 依赖倒转原则是基于这样的设计理念：相对于细节的多变性，抽象的东西要稳定的多。以抽象为基础搭建的架构比细节为基础的架构要稳定的多。在java中，抽象指的是接口或者抽象类，细节就是具体的实现类
* 使用接口或抽象类的目的是制定好规范，而不涉及任何具体的操作，把展现细节的任务交给它们的实现类去完成
#### 依赖关系传递的三种方式
* 接口传递
* 构造方法传递
* setter方式传递
#### 依赖倒转原则的注意事项和细节
* 底层模块尽量都要有抽象类或接口，或者俩者都有，程序稳定性更好
* 变量的声明类型尽量是抽象类或者接口，这样我们的变量引用和实际对象间，就存在一个缓冲层，利于程序扩展和优化
* 继承时遵遁里氏替换原则
### <四>里氏替换原则（Liskov Substitution Principle）
#### OO中继承性的思考和说明
* 1> 继承包含这样一层含义：父类中凡事已经实现好的方法，实际上是在设定规范和契约，虽然不强制要求所有的子类必须遵遁这些契约，但是如果子类对这些已经实现的方法任意修改，就会对整个继承体系造成破坏
* 2> 继承在给程序带来遍历的同时，也带来了弊端。比如继承会给程序带来侵入性，程序的可移植性降低，增加对象间的耦合性，如果一个类被其他类继承，则当这个类需要修改时，必须考虑所有的子类，并且父类修改后，所有涉及到子类的功能都可能产生故障
* 3> 问题提出：在编程中，如何正确的使用继承=》里氏替换原则
#### 基本介绍
* 所有引用基类的地方必须透明的使用其子类对象
* 在使用继承时，遵遁里氏替换原则，在子类中尽量不要重写父类的方法
* 继承实际上让俩个类的耦合性增加类，在适当的情况下，可以通过聚合、组合、依赖解决问题
### <五>开闭原则（Open Closed Principle）
#### 基本介绍
* 1> 开闭原则是编程中最基础、最重要的设计原则
* 2> 一个软件实体如类、模块和函数应该对扩展开放（对提供方），对修改关闭（对使用方）。用抽象构建框架，用实体扩展细节
* 3> 当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化
### <六>迪米特原则
#### 基本介绍
* 1> 一个对象应该对其他对象保持最少的了解
* 2> 类和类关系越密切，耦合度越大
* 3> 迪米特法则（Demeter Principle）又叫最少知道原则，即一个类对自己依赖的类知道的越少越好。
* 4> 迪米特法则还有个更简单的定义：只与直接的朋友通信
* 5> 直接的朋友：每个对象都会与其他对象有耦合关系，只要俩个对象之间有耦合关系，我们就说者俩个对象之间是朋友关系。耦合的方法有很多，依赖，关联，组合，聚合。   
    * 出现在成员变量、方法参数、方法返回值中的类为直接朋友，而出现在局部变量中的类不是直接朋友
#### 迪米特法则注意事项和细节
* 1> 迪米特法则的核心是降低类直接的耦合 
* 2> 但是注意：由于每个类都减少类不必要的依赖，因此迪米特法则只是要求降低类间的耦合关系，而不是要求完全没有依赖关系
### <七>合成复用原则
#### 基本介绍
原则是尽量使用合成/聚合的方式，而不是使用继承
## 设计原则的核心思想
* 1> 找出应用中可能需要变化之处，把它们独立出来，不要和那些不需要变化的代码混在一起
* 2> 针对接口编程，而不是针对实现编程
* 3> 为类交互对象之间的松耦合设计而努力


https://plantuml.com/zh/class-diagram
## 3.UML类图
## 4.设计模式概述
### 4.1 设计模式层次
* 刚学习编程不久，听说过什么是设计模式
* 有很长时间的编程经验，自己写过很多代码，其中用到了设计模式，但是自己却不知道
* 学习过设计模式，发现自己已经在使用了，并且发现了一些新的模式挺好用的
* 阅读了很多别人写的源码和框架，在其中看到别人的设计模式，并且能够领会设计模式的精妙和带来的好处
* 代码写着写着，自己都没有意识到使用了设计模式，并且熟练的写了出来
### 4.3 设计模式类型
* 创建型模式
    * 单例模式
    * 原型模式
    * 建造者模式
    * 工厂模式
    * 抽象工厂模式
* 结构型模式
    * 适配器模式
    * 桥接模式
    * 装饰模式
    * 组合模式
    * 外观模式
    * 享元模式
    * 代理模式
* 行为模式
    * 模版方法模式
    * 命令模式
    * 访问者模式
    * 迭代器模式
    * 观察者模式
    * 中介者模式
    * 备忘录模式
    * 解释器模式
    * 状态模式
    * 策略模式
    * 责任链模式