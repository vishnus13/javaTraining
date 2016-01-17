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
        System.out.println("parent class int 2 param"+(a+b));
    }
    void sum(String a,String b)
    {
        System.out.println("parent class string 2 param "+a+b);
    }
    void sub(float a,float b){
        System.out.println("parent class float 2 param "+(a-b));
    }
}
public class Calculate extends parentCalculate {

    void sum(int a,int b)
    {
        System.out.println("child class int 2 param "+(a+b));
    }
    void sum(int a,int b,int c){
        System.out.println("child class int 3 param "+(a+b+c));
    }
    void sub(float a,float b){
        System.out.println("child class float 2 param "+(a-b));
    }
    void sum(float a,float b){System.out.println("child class float "+(a+b));}
    public static void main(String args[]){
        Calculate obj=new Calculate();//child class instance
        parentCalculate pobj = new Calculate();//child class instance in base class reference
        pobj.sum(12,13);
        pobj.sum("java","Training");
        pobj.sub(15,5);
        obj.sum(10,10,10);
        obj.sum(20,20);
        obj.sum(10.78F,45.89F);
        obj.sub(10,5);//auto type conversion
        obj.sum("hello","world");
    }
}
