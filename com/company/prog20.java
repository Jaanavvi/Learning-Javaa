package com.company;
import java.util.Scanner;

import java.util.Scanner;

public class prog20 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 for rock ,2 paper,3 scissors");
        int str = 0;
        int str1 = 0;
        System.out.println("enter 1 to continue and 2 to exist");
        int m=sc.nextInt();
        while (m==1)
        {
            int c = (int) (Math.random() * 3) + 1;
            int s = sc.nextInt();
            System.out.println("computer chooses " + c);
            if (c == 1) {
                if (s == 1)
                    System.out.println("tie");

                 else if (s == 2) {
                    System.out.println("u win");
                    str++;

                } else if (s == 3) {
                    System.out.println("u lose");
                    str1++;

                }

            }


            if (c == 2) {
                if (s == 2)
                    System.out.println("tie");
                else if (s == 1) {
                    System.out.println("u lose");
                    str1++;
                } else if (s == 3) {
                    System.out.println("u win");
                    str++;
                }

            }


            if (c == 3) {
                if (s == 3)
                    System.out.println("tie");
                else if (s == 2) {
                    System.out.println("u lose");
                    str1++;
                } else if (s == 1) {
                    System.out.println("u win");
                    str++;
                }
            }

            System.out.println("computer points \t your points ");
            System.out.println(str1 + "         \t" + str);

            System.out.println("you want to continue?? type (1 or 2) 1 to continue and 2 for an exist!!!");
             m = sc.nextInt();

            if (m==2)
                System.exit(0);
        }
    }
}

