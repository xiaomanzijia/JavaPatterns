package com.zw.android.healthdoctor.test;

/**
 * Created by licheng on 13/10/16.
 */
public class ChildrenPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.CHILEDRENS;
    }

    @Override
    double getCharge(int daysRented) {
        double result = 1.5;
        if(daysRented > 3){
            result += (daysRented - 3 ) * 1.5;
        }
        return result;
    }
}
