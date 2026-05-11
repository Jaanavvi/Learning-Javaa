package com.company;
import java.util.Scanner;
public class prog65 {
    static void main() {
        try {
            int c = 17/9;

            } catch (ArithmeticException e) {
                System.out.println("haha");
            }
         catch (IllegalArgumentException e) {
            System.out.println("hehe");
        }
    }
}
