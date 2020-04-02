package com.xpit.creator;

public abstract class CPU implements Item {
    @Override
    public Packing packing(){
        return new Wrapper();
    }
}
