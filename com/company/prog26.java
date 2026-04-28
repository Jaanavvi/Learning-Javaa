package com.company;
import java.util.Scanner;
public class prog26 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        int i=1;
        while(i<=n)
        {
            if(i%2==0)
                s=s+i;
            i++;
        }
        System.out.println("sum "+s);

    }
}
