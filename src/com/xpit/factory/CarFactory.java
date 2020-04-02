package com.xpit.factory;

public class CarFactory {
    public Car createCar(String type) {
        if (type == null || type.equals("")) {
            return null;
        }
        switch (type) {
            case "baoma":
                return new Baoma();
            case "aodi":
                return new Aodi();
            default:
                return null;
        }
    }
}
