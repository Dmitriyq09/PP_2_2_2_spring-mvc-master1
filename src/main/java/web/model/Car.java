package web.model;

import java.util.Objects;

public class Car {
    private int id;
    private String model;
    private String color;

    public Car(String model, String color, int id) {
        this.model = model;
        this.color = color;
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSeries() {
        return id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", Model='" + model + '\'' +
                ", Brand='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, color);
    }
}
