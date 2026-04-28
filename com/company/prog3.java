package com.company;
import java.util.Scanner;
public class prog3
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        double t=0.0;
        for(int i=1;i<=3;i++)
        {
            System.out.println("marks of sub "+i);
            double a=sc.nextDouble();
            t=t+a;
        }
        double per=t/30;
        System.out.println("the percentage of 3 subjects is "+per);
    }
}
