package com.company;
import java.util.Scanner;
public class prog5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       float kilo=sc.nextFloat();
       float miles=kilo/1.609f;
        System.out.println("kilo to miless "+miles);
    }
}
