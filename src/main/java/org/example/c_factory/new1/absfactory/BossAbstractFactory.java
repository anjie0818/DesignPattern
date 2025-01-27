package org.example.c_factory.new1.absfactory;

//抽象产品（Bmw和Audi同理）
abstract class BenzCar {
    private String name;

    public abstract void drive();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//具体产品（Bmw和Audi同理）
class BenzSportCar extends BenzCar {
    public void drive() {
        System.out.println(this.getName() + "----BenzSportCar-----------------------");
    }
}

class BenzBusinessCar extends BenzCar {
    public void drive() {
        System.out.println(this.getName() + "----BenzBusinessCar-----------------------");
    }
}

abstract class BmwCar {
    private String name;

    public abstract void drive();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class BmwSportCar extends BmwCar {
    public void drive() {
        System.out.println(this.getName() + "----BmwSportCar-----------------------");
    }
}

class BmwBusinessCar extends BmwCar {
    public void drive() {
        System.out.println(this.getName() + "----BmwBusinessCar-----------------------");
    }
}

abstract class AudiCar {
    private String name;

    public abstract void drive();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class AudiSportCar extends AudiCar {
    public void drive() {
        System.out.println(this.getName() + "----AudiSportCar-----------------------");
    }
}

class AudiBusinessCar extends AudiCar {
    public void drive() {
        System.out.println(this.getName() + "----AudiBusinessCar-----------------------");
    }
}


//抽象工厂
abstract class Driver3 {
    public abstract BenzCar createBenzCar(String car) throws Exception;

    public abstract BmwCar createBmwCar(String car) throws Exception;

    public abstract AudiCar createAudiCar(String car) throws Exception;
}

//具体工厂
class SportDriver extends Driver3 {
    public BenzCar createBenzCar(String car) throws Exception {
        return new BenzSportCar();
    }

    public BmwCar createBmwCar(String car) throws Exception {
        return new BmwSportCar();
    }

    public AudiCar createAudiCar(String car) throws Exception {
        return new AudiSportCar();
    }
}

class BusinessDriver extends Driver3 {
    public BenzCar createBenzCar(String car) throws Exception {
        return new BenzBusinessCar();
    }

    public BmwCar createBmwCar(String car) throws Exception {
        return new BmwBusinessCar();
    }

    public AudiCar createAudiCar(String car) throws Exception {
        return new AudiBusinessCar();
    }
}

/**
 * 其中：BenzSportCar和BenzBusinessCar属于产品树；同理BmwSportCar和BmwBusinessCar。而BenzSportCar和BmwSportCar和AudiSportCar属于产品族。
 * 所以抽象工厂模式一般用于具有产品树和产品族的场景下。
 */
public class BossAbstractFactory {

    public static void main(String[] args) throws Exception {
        Driver3 d = new BusinessDriver();
        AudiCar car = d.createAudiCar("");
        car.drive();
    }
}