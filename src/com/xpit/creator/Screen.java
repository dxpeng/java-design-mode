package com.xpit.creator;

public abstract class Screen implements Item {
    @Override
    public Packing packing(){
        return new Wrapper();
    }
}
