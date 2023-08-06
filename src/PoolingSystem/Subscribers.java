package PoolingSystem;

public class Subscribers extends Passenger {

    public Subscribers(String name, String ID, Car reservedCar)  throws Exception {
        super(name, ID, reservedCar);
    }

    @Override
    public double computePrice() {
        double tripPrice = super.reservedCar.getRoute().getTripPrice();
        double discount = tripPrice - (0.5 * tripPrice);

        return discount;
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
        output += "   Passenger Type: Subscriber (50% discount)\n";
        output += "   Trip Original Price: " + super.reservedCar.getRoute().getTripPrice() + " SAR\n";
        output += "   After 50% discount. Final Price: " + computePrice() + " SAR\n";


        return output;
    }
}
