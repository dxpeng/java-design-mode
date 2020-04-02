package com.xpit.abstractfactory;

public interface AbstractFactory {
    Car createCar(String type);
    Price createPrice(String currency);
}
