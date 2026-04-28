package com.company;
import java.util.Scanner;
public class prog33
{
    static void main() {
        Scanner sc=new Scanner(System.in);
        int m[]=new int[5];
        for(int i=0;i<m.length;i++)
        {
            m[i]=sc.nextInt();
        }
        for(int i=m.length-1;i>=0;i--)
        {
            System.out.println(m[i]);
        }
    }
}
