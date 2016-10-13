package com.zw.android.healthdoctor.test;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by licheng on 13/10/16.
 */
public class Customer {
    private String _name;
    private Vector _retalls = new Vector();

    public Customer(String _name) {
        this._name = _name;
    }

    public void addRental(Rental arg){
        _retalls.add(arg);
    }

    public String get_name() {
        return _name;
    }

    public String statement(){
        Enumeration retals = _retalls.elements();
        String result = "Rental Record for " + get_name() + "\n";
        while (retals.hasMoreElements()){
            Rental each = (Rental) retals.nextElement();
            result += "\t" + each.get_movie().get_title() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }

        result += "Amount owned is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getFrequentRenterPoints()) + " frequent renter points";

        return result;
    }

    private double getTotalCharge(){
        double result = 0;
        Enumeration retals = _retalls.elements();
        while (retals.hasMoreElements()){
            Rental each = (Rental) retals.nextElement();
            result += each.getCharge();
        }
        return result;
    }


    private double getFrequentRenterPoints(){
        double result = 0;
        Enumeration retals = _retalls.elements();
        while (retals.hasMoreElements()){
            Rental each = (Rental) retals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }

//    private int getFrequentRenterPoints(Rental each) {
//        int frequentRenterPoints = 0;
//        if(each.get_movie().get_priceCode() == Movie.NEW_RELEASE && each.get_daysRented() > 1){
//            frequentRenterPoints ++;
//        }
//        return frequentRenterPoints;
//    }

//    private double getThisAmount(Rental aRental) {
//        return aRental.getCharge(aRental);
//    }


    public static void main(String[] args) {
        Customer c1 = new Customer("licheng");
        c1.addRental(new Rental(2,new Movie(0, "海上钢琴师")));
        c1.addRental(new Rental(4,new Movie(2, "英雄")));
        System.out.println(c1.statement());
    }
}
