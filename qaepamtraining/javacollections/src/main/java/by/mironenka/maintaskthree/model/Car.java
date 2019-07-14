package by.mironenka.maintaskthree.model;

public class Car implements Comparable<Car>{

    private final int number;

    public Car(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return number == car.number;
    }

    @Override
    public int hashCode() {
        return number;
    }

    public int compareTo(Car o) {
        return number - o.getNumber();
    }
}
