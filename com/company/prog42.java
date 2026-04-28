package com.company;
import java.util.Scanner;
class prog42
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=0;
        for(int i=1;i<=10;i++)
        {
            m=n*i;
            System.out.println("tables of "+n+" "+n+"*"+i+" "+m );

        }
    }
}
