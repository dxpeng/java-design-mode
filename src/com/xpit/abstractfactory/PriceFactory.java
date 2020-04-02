package com.xpit.abstractfactory;

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
