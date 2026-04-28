package com.company;
import java.util.Scanner;
public class input
{
    public static void main(String[]args)
    {
        System.out.println("taking input from the user");
      Scanner sc=new Scanner(System.in);
        System.out.println("enter no 1");
        boolean b1=sc.hasNextInt();
        System.out.println(b1);
        float a=sc.nextFloat();
        System.out.println("enter umber 2");
        float b=sc.nextFloat();
        float s=a+b;
       System.out.println("sum of 2 numbers "+s);
       String str=sc.nextLine();
        System.out.println(str);
    }
}
