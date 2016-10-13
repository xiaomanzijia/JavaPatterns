package com.zw.android.healthdoctor.test;

/**
 * Created by licheng on 13/10/16.
 */
public abstract class Price {
    abstract int getPriceCode();
    abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
