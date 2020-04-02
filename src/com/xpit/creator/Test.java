package com.xpit.creator;

public class Test {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerBuilder();
        Computer cheapComputer = computerBuilder.buildCheap();
        cheapComputer.showItem();
    }
}
