package com.zw.android.healthdoctor.test;

/**
 * Created by licheng on 13/10/16.
 */
public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(int _daysRented, Movie _movie) {
        this._daysRented = _daysRented;
        this._movie = _movie;
    }

    public int get_daysRented() {
        return _daysRented;
    }

    public Movie get_movie() {
        return _movie;
    }

    public int getFrequentRenterPoints() {
        return _movie.getFrequentRenterPoints(_daysRented);
    }


    public double getCharge() {
        return _movie.getCharge(_daysRented);
    }
}
