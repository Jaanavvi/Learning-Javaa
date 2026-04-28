package com.company;
import java.util.Scanner;
public class prog37
 {
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[2][3];
        int b[][]=new int[2][3];
        int s=0;
        for(int i=0;i<=2;i++)
        {
            for(int j=1;j<=3;i++)
            {
               a[i][j]=sc.nextInt();

            }
        }
        System.out.println("enter B ");
        for(int i=0;i<=2;i++)
        {
            for(int j=1;j<=3;i++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<=2;i++)
        {
            for(int j=1;j<=3;i++)
            {
               s=a[i][j]+b[i][j];
            }
        }
        System.out.println(" the sum "+s);
    }

}