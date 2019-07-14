package by.mironenka.maintask;

//Автостоянка. Доступно несколько машиномест. На одном месте может находиться только
// один автомобиль. Если все места заняты, то автомобиль не станет ждать больше
// определенного времени и уедет на другую стоянку.

import by.mironenka.maintask.car.Car;
import by.mironenka.maintask.parking.Parking;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main (String ... args){
        int carQty = 10, stationLimit = 7;
        Parking parking = new Parking(stationLimit);
        List<Thread> carList = createCars(carQty, parking);
        waitCars( carList);


        System.out.println(carList);
        System.out.println(parking.getVisitedCars());
    }

    public static List<Thread> createCars( int carQty, Parking station){
        List<Thread> carList = new ArrayList<>();
        for( int carNumber = 0; carNumber < carQty; carNumber++){
            int waitTime = (int) (Math.random()* 25);
            int startTime = (int) (Math.random()* 5);
            int parkedTime = (int) (Math.random()*25);
            carList.add(new Car(waitTime, startTime, parkedTime, station));
        }

        return carList;
    }

    public static void waitCars(List<Thread> threads){
        try{
            for(Thread thread: threads) thread.join();
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
