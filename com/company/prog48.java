package com.company;
import java.util.Scanner;
public class prog48 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(n+"*"+i+"\t "+(n*i));
        }
    }
}
