package com.xpit.creator;

public class Intel extends CPU {
    @Override
    public String name() {
        return "Intel 处理器";
    }

    @Override
    public int price() {
        return 1000;
    }
}
