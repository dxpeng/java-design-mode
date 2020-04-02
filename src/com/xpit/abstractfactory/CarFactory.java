
package com.xpit.abstractfactory;


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
