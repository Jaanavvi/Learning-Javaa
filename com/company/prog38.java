package com.company;
import java.util.Scanner;
public class prog38 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<=(a.length-1);i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=(a.length-1);i>=0;i--)
        {
            System.out.println(a[i]);
        }


    }
}
