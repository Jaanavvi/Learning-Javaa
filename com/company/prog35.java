package com.company;
import java.util.Scanner;
public class prog35 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int f=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n)
                f=1;
        }
        if(f==1)
            System.out.println("match foundd");
        else
            System.out.println("not found ");
    }
}
