package com.company;
import java.util.Scanner;
public class prog66  {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int m[] = new int[3];
        m[0] = 333;
        m[1] = 555;
        m[2] = 777;
        int i = 1;
        while (i <= 5)
        {
            System.out.println("enter a index number ");
            int ind = sc.nextInt();
            i++;
            try {
                if (ind == 1 || ind == 2 || ind == 0) {
                    System.out.println(m[ind]);
                    break;
                }
                System.out.println(m[ind]);
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("invalid try again !!!");
            }
            if (i > 5) {
                throw new RuntimeException("MAx retires reached");

            }
        }

    }
}


