package com.xpit.creator;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void showItem() {
        int total = 0;
        for (Item item : itemList) {
            System.out.println(item.packing().pack() + item.name() + item.price());
            total += item.price();
        }
        System.out.println("总价：" + total);
    }
}
