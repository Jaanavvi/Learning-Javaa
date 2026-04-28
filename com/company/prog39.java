package com.company;
import java.util.Scanner;
public class prog39 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]>max)
                max=a[i];
        }
        System.out.println("max element "+max);
    }
}
