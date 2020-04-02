package com.xpit.abstractfactory;

/**
 * 工厂生成器
 */
public class FactoryProducer {
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
