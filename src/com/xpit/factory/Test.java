package com.xpit.factory;

public class Test {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        // 创建baoma
        Car baoma = carFactory.createCar("baoma");
        baoma.make();
        // 创建aodi
        Car aodi = carFactory.createCar("aodi");
        aodi.make();
    }
}
