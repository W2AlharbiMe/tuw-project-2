package PoolingSystem;

public class Route {
    private Address pickup;
    private Address destination;
    private double tripPrice;

    public Route(Address pickup, Address destination, double tripPrice) {
        this.pickup = pickup;
        this.destination = destination;
        this.tripPrice = tripPrice;
    }

    public Address getPickup() {
        return pickup;
    }

    public void setPickup(Address pickup) {
        this.pickup = pickup;
    }

    public Address getDestination() {
        return destination;
    }

    public void setDestination(Address destination) {
        this.destination = destination;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }
}
