package edu.tutorial.javaTraining;

class MyRunnableThread implements Runnable{
    public void run() {
        for(int i=0;i<10;i++){
            try{
                System.out.println(" MyRunnableThread"+i);
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                  iex.printStackTrace();
            }
        }
        System.out.println("End of MyRunnableThread");
    }
}

class ThreadClass extends Thread{
    public void run(){
        for(int i =0;i<10;i++) {
            try {
                System.out.println("thread class" + i);
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                iex.printStackTrace();
            }
        }
        System.out.println("End of thread class");
    }
}

public class ThreadExample {
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        MyRunnableThread mrt = new MyRunnableThread();
        Thread t = new Thread(mrt);
        t.start();
        ThreadClass t1 = new ThreadClass();
        t1.start();
        for(int i=0;i<10;i++){
            try{
                System.out.println("Main Thread: "+i);
                Thread.sleep(100);
            } catch (InterruptedException iex){
                     iex.printStackTrace();
            }
        }
        System.out.println("End of Main Thread");
    }

}
