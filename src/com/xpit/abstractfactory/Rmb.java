package com.xpit.abstractfactory;

public class Rmb implements Price {
    @Override
    public void setPrice() {
        System.out.println("人民币");
    }
}
