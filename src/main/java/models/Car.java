package models;

import java.util.Objects;

public class Car {
    private String model;
    private String brand;
    private int mileage;

    public Car(String model, String brand, int mileage) {
        this.model = model;
        this.brand = brand;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getMileage() == car.getMileage() && Objects.equals(getModel(), car.getModel()) && Objects.equals(getBrand(), car.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getBrand(), getMileage());
    }
}
