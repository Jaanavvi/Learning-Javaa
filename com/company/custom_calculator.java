package com.company;
import java.util.Scanner;
public class custom_calculator  {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        long a=sc.nextLong();
        System.out.println("enter one m0re number plss");
        long b=sc.nextInt();
        System.out.println("enter wt do u want to do 1-add,2-sub,3-multiply,4-division");
        int k=sc.nextInt();
        switch(k)
        {
            case 1: {
                long s = a + b;
                System.out.println("the added value " + s);
            }
            break;
            case 2:
            {
                long m=a-b;
                System.out.println("subtracted value "+m);
            }
            break;
            case 3:
            {
                long e=a*b;
                System.out.println("multiply value "+e);
            }
            break;
            case 4:
            {
                long d=a/b;
                System.out.println("divided value "+d);
            }
            break;
        }


    }
}
