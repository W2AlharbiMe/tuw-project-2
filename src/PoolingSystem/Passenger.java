package PoolingSystem;

public abstract class Passenger {
    protected String name;
    protected String ID;
    protected Car reservedCar;

    public abstract double computePrice();

    public abstract String toString();

    public Passenger(String name, String ID, Car reservedCar) throws Exception {
        this.name = name;
        this.ID = ID;
        this.reservedCar = reservedCar;

        reserveCar();
    }

    public void reserveCar() throws Exception {
        if(reservedCar.getCapacity() == 0) {
            throw new Exception("maximum car ("+  reservedCar.getCode() +") capacity reached.");
        }

        reservedCar.setCapacity(
                reservedCar.getCapacity() - 1
        );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

}
