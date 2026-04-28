package com.company;
import java.util.Scanner;
public class prog25
{
    static void main() {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=4;i++)
        {
            for(int j=i;j<=4;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
