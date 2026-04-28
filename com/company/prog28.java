package com.company;
import java.util.Scanner;
public class prog28
{
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;

        }
        System.out.println("factorial "+f);
    }
}
