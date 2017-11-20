package com.example.licheng.lcdemo.patterm.state.build;

/**
 * Created by changyuan on 2017/11/20.
 */

public class Client {
    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();

        Meal vegMeal = builder.prepareVegMeal();
        vegMeal.showItems();

        System.out.println("Total cost is: " + vegMeal.getCost());

        Meal nonVegMeal = builder.prepareNonVegMeal();
        nonVegMeal.showItems();

        System.out.println("Total cost is: " + nonVegMeal.getCost());
    }
}
