package edu.tutorial.javaTraining;

import java.util.Scanner;

/**
 * Created by shivatej on 1/25/2016.
 *
 */
class logger{
    private static logger instance = null;

    private logger(){

    }
    public void print(String str){
        System.out.println(str);
    }
    public static logger getInstance() {
        if(instance == null) {
            instance = new logger();
        }
        return instance;
    }
}

class TrainSeatReservation{
    private static TrainSeatReservation instance = null;
    public static int seatsAvailable = 1000;

    private TrainSeatReservation(){

    }
    public static TrainSeatReservation getInstance() {
        if(instance == null) {
            instance = new TrainSeatReservation();
        }
        return instance;
    }
        }
public class SingletonExample
{

    public static void main(String[] args){
        int choice;
        TrainSeatReservation tr = TrainSeatReservation.getInstance();
        logger log = logger.getInstance();
        log.print("Train seat reservation system");
        log.print("Number of seat avaiable"+tr.seatsAvailable);
        log.print("1.Reserve the seat\n2. cancel the seat");
        log.print("Enter your choice");
        Scanner sc = new Scanner(System.in);
        choice = Integer.parseInt(sc.next());
        switch (choice){
            case 1: tr.seatsAvailable--;
                log.print("Seat reserved successfully");
                break;
            case 2:tr.seatsAvailable++;
                log.print("seat cancelled successfully");
                break;
            default:
                log.print("wrong option");
        }

    }
}
