package com.company;
import java.util.Scanner;
public class prog49 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
