package com.xpit.creator;

public class Amd extends CPU {
    @Override
    public String name() {
        return "AMD 处理器";
    }

    @Override
    public int price() {
        return 2000;
    }
}
