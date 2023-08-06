package PoolingSystem;

import java.util.HashMap;

public class NonSubscribers extends Passenger {
    private HashMap<String, Boolean> coupons;
    private boolean applyCoupon = false;
    private String appliedCoupon;



    public NonSubscribers(String name, String ID, Car reservedCar, HashMap<String, Boolean> coupons) throws Exception {
        super(name, ID, reservedCar);
        this.coupons = coupons;
    }

    public void activateCoupon(String coupon) {
        if(coupons.containsKey(coupon) && coupons.get(coupon)) {
            applyCoupon = true;
            appliedCoupon = coupon;
        }
    }

    @Override
    public double computePrice() {
        double tripPrice = super.reservedCar.getRoute().getTripPrice();

        if(applyCoupon) {
            return (tripPrice - (0.1 * tripPrice));
        }

        return tripPrice;
    }

    @Override
    public String toString() {
        String output = "";

        output += "<-- Passenger Details -->\n";
        output += "Passenger Name: " + super.name + "\n";
        output += "Passenger ID: " + super.ID + "\n";

        output += "<-- Car Details -->\n";
        output += "Reserved Car Code: " + super.reservedCar.getCode() + "\n";
        output += "Car Current capacity: " + super.reservedCar.getCapacity() + "\n";


        output += "<-- Pickup Details -->\n";
        output += super.reservedCar.getRoute().getPickup() + "\n";
        output += "<-- Destination Details -->\n";
        output += super.reservedCar.getRoute().getDestination() + "\n";


        output += "<-- Trip Cost -->\n";
        output += "   Passenger Type: Non Subscriber\n";
        output += "   Trip Original Price: " + super.reservedCar.getRoute().getTripPrice() + " SAR\n";


        if(applyCoupon) {
            output += "   After 10% discount Used Coupon ("+ appliedCoupon +"). Final Price: " + computePrice() + " SAR\n";
        } else {
            output += "   No Coupon Was Applied. Final Price: " + super.reservedCar.getRoute().getTripPrice() + " SAR\n";
        }


        return output;
    }



}
