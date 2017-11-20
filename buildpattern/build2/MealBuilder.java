package com.example.licheng.lcdemo.patterm.state.build;

/**
 * Created by changyuan on 2017/11/20.
 */

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBuger());
        meal.addItem(new Coco());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
