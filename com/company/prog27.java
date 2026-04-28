package com.company;
import java.util.Scanner;
public class prog27
{
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<=10;i++)
        {
            s=n*i;
            System.out.println(" the tables "+ n +"*"+i +"\t "+s);
        }
    }
}
