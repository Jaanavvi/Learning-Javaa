package com.company;
import java.util.Scanner;
public class prog50
{
    static int sum(int n)
    {
        if(n==0)
            return 0;
        else
        {
            int s=0;
            for(int i=1;i<=n;i++)
            {
                s=s+i;
            }
            return s;
        }
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
       prog50 obj=new prog50();
       int x=sc.nextInt();
        System.out.println("the sum "+obj.sum(x));

    }
}
