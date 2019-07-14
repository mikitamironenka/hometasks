package by.mironenka.maintaskthree.parking;

import by.mironenka.maintaskthree.model.Car;

import java.util.PriorityQueue;
import java.util.Queue;

//  Реализовать класс, моделирующий работу N-местной автостоянки.
//  Машина подъезжает к определенному месту и едет вправо, пока не встретится свободное место.
//  Класс должен поддерживать методы, обслуживающие приезд и отъезд машины.

public class Parking {

    private final Queue<Car> parkingQueue;
    private final int numberOfParkingPlaces;
    private int carCounter = 0;

    public Parking(int numberOfParkingPlaces) {
        this.numberOfParkingPlaces = numberOfParkingPlaces;
        this.parkingQueue = new PriorityQueue<Car>(numberOfParkingPlaces);
    }

    public Queue<Car> getParkingQueue() {
        return parkingQueue;
    }

    public int getNumberOfParkingPlaces() {
        return numberOfParkingPlaces;
    }

    public void addCarToParking(Car car) throws Exception {

        if(carCounter < numberOfParkingPlaces) {
            parkingQueue.add(car);
            carCounter++;
        } else {
            throw new Exception("Parking is full. Wait for place");
        }
    }

    public void removeCarFromParking(Car car){
        parkingQueue.remove(car);
        carCounter--;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "parkingQueue=" + parkingQueue +
                ", numberOfParkingPlaces=" + numberOfParkingPlaces +
                '}'
                ;
    }

}
