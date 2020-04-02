package com.xpit.abstractfactory;

public class Test {
    public static void main(String[] args) {
        AbstractFactory carFactory = FactoryProducer.getFactory("Car");
        Car dazhong = carFactory.createCar("dazong");
        dazhong.make();
    }
}
