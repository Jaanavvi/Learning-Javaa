package com.company;
import java.util.Scanner;
public class prog23 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        do {
          if(i>0&&n>0)
              System.out.println(i);
           i++;
        }
        while(i<=n);
    }
}
