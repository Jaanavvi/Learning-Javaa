package com.company;
import java.util.Scanner;
public class prog36
{
    static void main() {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int avg=0;
        int s=0;
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            s=s+arr[i];
            c++;
        }
                for(int element:arr)
                {
                    avg=s/c;

                }
        System.out.println(avg);
    }
}
