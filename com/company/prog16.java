package com.company;
import java.util.Scanner;
public class prog16
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        double in= sc.nextDouble();
        double tax=0;
        if(in>=2.5&&in<5.0)
            tax=(in-2.5)*(5/100.0);
        else if(in>=5.0&&in<10.0)
            tax=(in-2.5)*(5/100.0)+(in-5.0)*(20/100.0);
        else
            tax=(in-2.5)*(5/100.0)+(in-5.0)*(20/100.0)+(in-10.0)*(30/100.0);
        System.out.println("tax paid "+tax);
        System.out.println("income "+in);
    }
}
