package com.company;
import java.util.Scanner;
public class prog_1
{
    public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number of subs");
    int n=sc.nextInt();
    double t=0.0;
    System.out.println("total marks ");
    int x=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        System.out.println("marks of sub "+i);
       double a=sc.nextDouble();
       t=t+a;
    }
    double per=(t/n*x)*100;
    System.out.println("the percentage of 5 subjects is "+per);
}
}
