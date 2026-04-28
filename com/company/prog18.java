package com.company;
 import java.util.Scanner;
public class prog18
{
    static void main() {
        Scanner sc=new Scanner(System.in);
        long y=sc.nextLong();
        if(y%4==0&&y%400==0&&y%100==0)

            System.out.println("leap year !!!");
        else
            System.out.println("NOT A LEAP YEAR ");

    }
}
