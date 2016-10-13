package com.zw.android.healthdoctor.test;

/**
 * Created by licheng on 13/10/16.
 */
public class Movie {
    public static final int CHILEDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private Price _price;

    public Movie(int _priceCode, String _title) {
        this._title = _title;
        set_priceCode(_priceCode);
    }

    public int get_priceCode(){
        return _price.getPriceCode();
    }

    public void set_priceCode(int arg){
        switch (arg){
            case REGULAR:
                _price = new RegularPrice();
                break;
            case NEW_RELEASE:
                _price = new NewRealeasePrice();
                break;
            case CHILEDRENS:
                _price = new ChildrenPrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }



    public String get_title() {
        return _title;
    }



    public int getFrequentRenterPoints(int daysRented) {
        return _price.getFrequentRenterPoints(daysRented);
    }

    public double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }

}
