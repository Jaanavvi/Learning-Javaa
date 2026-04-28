package com.company;
import java.util.Scanner;
public class prog32 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s = s + (8 * i);
        }
        System.out.println("the sum "+s);
    }
}
