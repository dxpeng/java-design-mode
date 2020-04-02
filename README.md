# java-design-mode
设计模式

#### 工厂模式Factory
工厂模式属于创建型模式，用于创建对象实例。  
隐藏创建对象的逻辑，通过提供一个共同的接口给调用方使用。  
```
1. 定义接口
public interface Car {
    void make();
}

2. 定义实现接口类
public class BaoMa implements Car {
    @Override
    public void make() {
        System.out.println("宝马");
    }
}

public class Aodi implements Car {
    @Override
    public void make() {
        System.out.println("奥迪");
    }
}

3. 定义创建对象工厂类
public class CarFactory {
    /**
     * 根据传值创建不同的对象
     */
    public Car createCar(String type) {
        if (type == null || type.equals("")) {
            return null;
        }
        switch (type) {
            case "baoma":
                return new BaoMa();
            case "aodi":
                return new Aodi();
            default:
                return null;
        }
    }
}

4. 测试
public class Test {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        // 创建baoma
        Car baoma = carFactory.createCar("baoma");
        baoma.make();
        // 创建奥迪
        Car aodi = carFactory.createCar("aodi");
        aodi.make();
    }
}

```

#### 抽象工厂模式
抽象工厂即围绕一个超级工厂创建其他工厂。  
```
1. 定义抽象工厂
public interface AbstractFactory {
    Car createCar(String type);
    Price createPrice(String currency);
}

2. 定义实现抽象工厂类
public class CarFactory implements AbstractFactory {
    @Override
    public Car createCar(String type) {
        if (type == null || type.equals("")) {
            return null;
        }
        switch (type) {
            case "dazong":
                return new Dazong();
            default:
                return null;
        }
    }

    @Override
    public Price createPrice(String currency) {
        return null;
    }
}


public class PriceFactory implements AbstractFactory {
    @Override
    public Car createCar(String type) {
        return null;
    }

    @Override
    public Price createPrice(String currency) {
        if (currency == null || currency.equals("")) {
            return null;
        }
        switch (currency) {
            case "RMB":
                return new Rmb();
            default:
                return null;
        }
    }
}

3. 定义工厂生成器类
public class FactoryProducer {
	// 定义为静态方法，直接 类名.方法 调用
    public static AbstractFactory getFactory(String factoryType) {
        if ("Car".equals(factoryType)) {
            return new CarFactory();
        } else if ("Price".equals(factoryType)) {
            return new PriceFactory();
        } else {
            return null;
        }
    }
}

4. 测试
public class Test {
    public static void main(String[] args) {
		// 先获取工厂
        AbstractFactory carFactory = FactoryProducer.getFactory("Car");
		// 通过工厂创建类对象
        Car dazhong = carFactory.createCar("dazong");
        dazhong.make();
    }
}

```

#### 单例模式
类只能创建一个对象实例，即为单例模式。  
设置类的构造方法为private。  
由类内部创建自身对象实例并通过静态方法获取。  
```
1. 定义单例类
public class SingleObject {
    // 设置私有构造方法
    private SingleObject() {}

    // 创建类对象实例
    private static SingleObject instance = new SingleObject();

    // 获取类对象实例
    public static SingleObject getInstance() {
        return instance;
    }

    // 方法
    public void say() {
        System.out.println("单例类");
    }
}

2. 测试
public class Test {
    public static void main(String[] args) {
        SingleObject sob = SingleObject.getInstance();
        sob.say();
    }
}
```

#### 创造者模式
创造者模式即将多个简单对象构建成一个复杂的对象。  
```
```






