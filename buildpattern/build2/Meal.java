package com.example.licheng.lcdemo.patterm.state.build;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by changyuan on 2017/11/20.
 */

public class Meal {
    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item){
        itemList.add(item);
    }

    public Double getCost() {
        double cost = 0.0d;
        for (Item item : itemList) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : itemList) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.pack().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
