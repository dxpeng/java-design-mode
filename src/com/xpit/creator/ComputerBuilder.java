package com.xpit.creator;

public class ComputerBuilder {
    public Computer buildCheap() {
        Computer computer = new Computer();
        computer.addItem(new Amd());
        computer.addItem(new Phil());
        return computer;
    }
}
