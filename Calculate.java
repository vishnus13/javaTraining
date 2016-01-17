package edu.tutorial.javaTraining;

/**
 * Created by shivatej on 1/17/2016.
 */
class parentCalculate
{

    void sum(float a,float b)
    {
        System.out.println(a+b);
    }

    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    void sum(String a,String b)
    {
        System.out.println(a+b);
    }
}
public class Calculate extends parentCalculate {

    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void main(String args[]){
        Calculate obj=new Calculate();
        obj.sum(10,10,10);
        obj.sum(20,20);
        obj.sum(10.78F,45.89F);
        obj.sum("hello","world");
    }
}
