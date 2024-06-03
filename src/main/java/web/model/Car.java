package web.model;

import java.util.Objects;

public class Car {
    private int id;
    private String Model;
    private String Brand;

    public Car(String model, String brand, int id) {
        Model = model;
        Brand = brand;
        id = id;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getSeries() {
        return id;
    }

    public void setSeries(String id) {
        id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", Model='" + Model + '\'' +
                ", Brand='" + Brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Objects.equals(Model, car.Model) && Objects.equals(Brand, car.Brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Model, Brand);
    }
}
