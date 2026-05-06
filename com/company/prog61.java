package com.company;
import java.util.Scanner;
class myThreads extends Thread
{
  public void run()
    {
        while(true) {
            System.out.println("good morning");
        }
    }
}

    class myThread1 extends Thread {
        public void run() {
            while (true) {
                System.out.println("welcome");
            }
        }
    }
public class prog61 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        myThreads t1 = new myThreads();
        myThread1 t2 = new myThread1();
        t1.start();
        t2.start();
    }
}
