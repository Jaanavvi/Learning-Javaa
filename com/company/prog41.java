package com.company;
import java.util.Scanner;
public class prog41 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int s=0;
        int f=0;
        int f1=0;
        for(int i=0;i<=a.length-1;i++)
        {
            a[i]=sc.nextInt();

        }
        for(int i=0;i<a.length-1;i++) {

                if (a[i] >a[i+1]) {
                    f = 1;
                    break;
                }
        }
            if(f==1)
                System.out.println("  sorted");
            else
                System.out.println("not sorted");

    }
}
