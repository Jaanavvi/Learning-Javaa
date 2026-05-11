package com.company;
import java.util.Scanner;
public class prog63 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        int m[] = new int[3];
        m[0] = 44;
        m[1] = 33;
        m[2] = 99;
        while (b) {
            System.out.println("enter an index number pls");
            int ind = sc.nextInt();
            try {
                System.out.println("welcomee!!!");
                try {
                    System.out.println(m[ind]);
                    b=false;

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Invalid try again !!!");
                }
            } catch (Exception e) {
                    System.out.println("!!!! try again");
                System.out.println(e);
            }
        }
    }
}