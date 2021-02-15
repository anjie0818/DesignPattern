### 工厂模式
* 1>工厂模式的意义
    * 将实例化对象的代码提取出来，放到一个类中统一管理和维护，达到和主项目依赖关系的解耦。从而提高项目的扩展和维护性
* 2>三种工厂模式（简单工厂模式、工厂方法模式、抽象工厂模式）
* 3>设计模式的依赖
    * 创建对象实例时，不要直接new类，而是把这个new类的动作放在一个工厂的方法中，并返回。
    * 不要让类继承具体类，而是继承抽象类或者是实现interface
    * 不要覆盖基类中已经实现的方法
### 工厂模式
old
### 工厂模式
new
https://www.jianshu.com/p/6d447cea14c7
#### 使用场景
* 在编码时不能预见需要创建哪种类的实例
* 系统不应依赖于产品类实例如何被创建、组合和表达的细节
### 简单工厂模式
这个模式本身很简单而且使用在业务较简单的情况下。一般用于小项目或者具体产品很少扩展的情况（这样工厂类才不用经常更改）。
#### 组成
* 工厂类角色：这是本模式的核心，含有一定的商业逻辑和判断逻辑，根据逻辑不同，产生具体的工厂产品。如例子中的Driver类。
* 抽象产品角色：它一般是具体产品继承的父类或者实现的接口。由接口或者抽象类来实现。如例中的Car接口。
* 具体产品角色：工厂类所创建的对象就是此角色的实例。在java中由一个具体类实现，如例子中的Benz、Bmw类。
#### 特点
* 优点
    * 符合现实中的情况；而且客户端免除了直接创建产品对象的责任，而仅仅负责“消费”产品
* 缺点
    * 当增加了一辆车的时候，只要符合抽象产品制定的合同，那么只要通知工厂类知道就可以被客户使用了。（即创建一个新的车类，继承抽象产品Car）那么 对于产品部分来说，它是符合开闭原则的——对扩展开放、对修改关闭；但是工厂类不太理想，因为每增加一辆车，都要在工厂类中增加相应的商业逻辑和判 断逻辑，这显自然是违背开闭原则的
### 工厂方法模式
#### 组成
* 抽象工厂角色： 这是工厂方法模式的核心，它与应用程序无关。是具体工厂角色必须实现的接口或者必须继承的父类。在java中它由抽象类或者接口来实现。
* 具体工厂角色：它含有和具体业务逻辑有关的代码。由应用程序调用以创建对应的具体产品的对象。在java中它由具体的类来实现。
* 抽象产品角色：它是具体产品继承的父类或者是实现的接口。在java中一般有抽象类或者接口来实现。
* 具体产品角色：具体工厂角色所创建的对象就是此角色的实例。在java中由具体的类来实现。
#### 特点
* 优点
    * 工厂方法模式是完全符合开闭原则的
* 缺点
    * 使用工厂方法模式足以应付我们可能遇到的大部分业务需求。
    * 但是当产品种类非常多时，就会出现大量的与之对应的工厂类，这不应该是我们所希望的。
    * 所以我建议在这种情况下使用简单工厂模式与工厂方法模式相结合的方式来减少工厂类：
        * 即对于产品树上类似的种类（一般是树的叶子中互为兄弟的）使用简单工厂模式来实现。
* 升级
    * 当然特殊的情况，就要特殊对待了：对于系统中存在不同的产品树，而且产品树上存在产品族（下一节将解释这个名词）。那么这种情况下就可能可以使用抽象工厂模式了。
### 抽象工厂模式
```
先来认识下什么是产品族： 位于不同产品等级结构中，功能相关联的产品组成的家族。

BmwCar和BenzCar就是两个产品树（产品层次结构）；
而BenzSportsCar和BmwSportsCar就是一个产品族。他们都可以放到跑车家族中，因此功能有所关联。
同理BmwBussinessCar和BenzBusinessCar也是一个产品族。
```
#### 使用场景
* 1.系统中有多个产品族，而系统一次只可能消费其中一族产品
* 2.同属于同一个产品族的产品一起使用。
#### 组成
* 抽象工厂角色： 这是工厂方法模式的核心，它与应用程序无关。是具体工厂角色必须实现的接口或者必须继承的父类。在java中它由抽象类或者接口来实现。
* 具体工厂角色：它含有和具体业务逻辑有关的代码。由应用程序调用以创建对应的具体产品的对象。在java中它由具体的类来实现。
* 抽象产品角色：它是具体产品继承的父类或者是实现的接口。在java中一般有抽象类或者接口来实现。
* 具体产品角色：具体工厂角色所创建的对象就是此角色的实例。在java中由具体的类来实现。
#### 特点
* 优点
* 缺点
    * 其中：BenzSportCar和BenzBusinessCar属于产品树；同理BmwSportCar和BmwBusinessCar。而BenzSportCar和BmwSportCar和AudiSportCar属于产品族。
      所以抽象工厂模式一般用于具有产品树和产品族的场景下
* 改进
所以可以用简单工厂配合反射来改进抽象工厂：
```java
abstract class BenzCar{  
    private String name;  
      
    public abstract void drive();  
      
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
}  
class BenzSportCar extends BenzCar{  
    public void drive(){  
        System.out.println(this.getName()+"----BenzSportCar-----------------------");  
    }  
}  
class BenzBusinessCar extends BenzCar{  
    public void drive(){  
        System.out.println(this.getName()+"----BenzBusinessCar-----------------------");  
    }  
}  
  
abstract class BmwCar{  
    private String name;  
      
    public abstract void drive();  
      
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
}  
class BmwSportCar extends BmwCar{  
    public void drive(){  
        System.out.println(this.getName()+"----BmwSportCar-----------------------");  
    }  
}  
class BmwBusinessCar extends BmwCar{  
    public void drive(){  
        System.out.println(this.getName()+"----BmwBusinessCar-----------------------");  
    }  
}  
  
abstract class AudiCar{  
    private String name;  
      
    public abstract void drive();  
      
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
}  
class AudiSportCar extends AudiCar{  
    public void drive(){  
        System.out.println(this.getName()+"----AudiSportCar-----------------------");  
    }  
}  
class AudiBusinessCar extends AudiCar{  
    public void drive(){  
        System.out.println(this.getName()+"----AudiBusinessCar-----------------------");  
    }  
}  
  
  
/** 
 * 简单工厂通过反射改进抽象工厂及其子工厂 
 * @author Administrator 
 * 
 */  
class Driver3{  
    public static BenzCar createBenzCar(String car) throws Exception {  
        return (BenzCar) Class.forName(car).newInstance();  
    }  
      
    public static BmwCar createBmwCar(String car) throws Exception {  
        return (BmwCar) Class.forName(car).newInstance();  
    }  
      
    public static AudiCar createAudiCar(String car) throws Exception {  
        return (AudiCar) Class.forName(car).newInstance();  
    }  
}  
//客户端  
public class SimpleAndAbstractFactory {  
  
    public static void main(String[] args) throws Exception {  
  
        AudiCar car = Driver3.createAudiCar("com.java.pattendesign.factory.AudiSportCar");  
        car.drive();  
    }  
}  
```