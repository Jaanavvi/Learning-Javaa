package com.company;
import java.util.Scanner;
public class prog40 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int min=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
            min=a[0];
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
                min=a[i];
        }
        System.out.println("min element "+min);
    }
}
