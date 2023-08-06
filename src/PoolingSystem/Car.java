package PoolingSystem;

public class Car {
    private String code;
    private Route route;
    private int capacity = 5;

    public Car(String code, Route route) {
        this.code = code;
        this.route = route;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
