package com.company;
import java.util.Scanner;
public class prog34
{
    static void main() {
        Scanner sc=new Scanner(System.in);
        float a[]=new float[5];
        float s=0.0f;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextFloat();
            s=s+a[i];
        }
        System.out.println("sum  "+s);


    }
}
