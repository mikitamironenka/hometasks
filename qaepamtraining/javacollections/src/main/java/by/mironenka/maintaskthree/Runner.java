package by.mironenka.maintaskthree;

import by.mironenka.maintaskthree.model.Car;
import by.mironenka.maintaskthree.parking.Parking;

public class Runner {

    public static void main(String[] args) throws Exception {

        Parking parking = new Parking(5);
        Car carOne = new Car(1);
        Car carTwo = new Car(2);
        Car carThree = new Car(3);
        Car carFour = new Car(4);
        Car carFive = new Car(5);

        parking.addCarToParking(carOne);
        parking.addCarToParking(carTwo);
        parking.addCarToParking(carThree);
        parking.addCarToParking(carFour);
        parking.addCarToParking(carFive);

        for(Car car : parking.getParkingQueue())
            System.out.println(car);


        parking.removeCarFromParking(carOne);

        for(Car car : parking.getParkingQueue())
            System.out.println(car);

        parking.addCarToParking(carOne);

        for(Car car : parking.getParkingQueue())
            System.out.println(car);
    }
}
