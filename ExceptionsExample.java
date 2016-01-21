package edu.tutorial.javaTraining;

import java.util.Scanner;

/**
 * Created by shivatej on 1/19/2016.
 */
public class ExceptionsExample  {

    public static void main(String[] args){
        System.out.print("Banking system");
        System.out.println("choose the options");
        bankDetails db = new bankDetails();
        int choice;
        int amount;
        System.out.println("1. Money withdraw\n2. Money deposit");
        Scanner sc = new Scanner(System.in);
        try {
            choice = Integer.parseInt(sc.next());
            switch (choice){
                case 1:
                    System.out.println("Enter the amount");
                    amount = Integer.parseInt(sc.next());
                    if(amount < 0){
                        throw new RuntimeException("amount cannot be negative value");
                    }
                    else{
                        if(db.checkBalance(amount)){
                            System.out.println("successfully withdrawn");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter the amount");
                    System.out.println("Money Deposited");
                    break;
                default:
                    throw new WrongChoice("wrong choice");
            }
        }
        catch (WrongChoice e){
         System.out.print(e.getMessage());
        }
        catch (RuntimeException e){
            e.printStackTrace();
        }
    }
}

class bankDetails extends Exception{
    private int availableAmount = 2000;
    boolean checkBalance(int amount){
      boolean result = false;
        if( availableAmount < 2000 ){
            return true;
        }
        else{
             throw new RuntimeException("insufficient funds");
        }
    }
}
/*
* user defined exceptions */
class WrongChoice extends Exception{
    WrongChoice(String msg){
        super(msg);
    }
}