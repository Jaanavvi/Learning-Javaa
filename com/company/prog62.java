package com.company;
import java.util.Scanner;
class myThread extends Thread
{
    public void run()
    {

            System.out.println("good morning");
        }
    }


class myonlyThread1 extends Thread {

    public void run() {
            System.out.println("welcome");
        }
    }

public class prog62 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        myThread t1 = new myThread();
        myonlyThread1 t2 = new myonlyThread1();
        t1.setPriority(7);
        t2.setPriority(10);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.start();
        t2.start();
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());

    }
}


