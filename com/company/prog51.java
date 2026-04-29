package com.company;
import java.util.Scanner;
public class prog51 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        for (int i = 4; i >= 1; i--) {
             for(int j=i;j>=1;j--)
             {
                 System.out.print("*");
             }
            System.out.println();
        }
    }
}
