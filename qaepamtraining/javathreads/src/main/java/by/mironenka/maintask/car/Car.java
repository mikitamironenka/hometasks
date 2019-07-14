package by.mironenka.maintask.car;

import by.mironenka.maintask.parking.Parking;

public class Car extends Thread {

    private int waitingTime;
    private int startTime;
    private int parkedTime;
    private Parking parking;
    private static int threadQty = 0;
    private int number = ++threadQty;

    public int getWaitingTime(){ return waitingTime;}

    public Car( int waitTime, int startTime, int parkedTime, Parking parking){
        this.waitingTime = waitTime;
        this.startTime = startTime;
        this.parkedTime = parkedTime;
        this.parking = parking;
        start();
    }


    @Override
    public void run(){
        try{
            wait(startTime);
            boolean isAccepted = parking.accept(this);
            if(isAccepted){
                wait(parkedTime);
                parking.release(this);
            } else{
                System.out.println( this + "can't wait more");
            }
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

    }

    public void wait(int seconds) throws InterruptedException{
        Thread.sleep(seconds*1000);
    }

    @Override
    public String toString(){
        return "Thread number: " + number
                + " waitingTime: " + waitingTime
                + " startTime:" + startTime
                + " parkedTime:" + parkedTime
                + "\n";
    }
}
