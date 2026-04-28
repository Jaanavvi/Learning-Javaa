package com.company;
import java.util.Scanner;
public class prog8
{
    static void main() {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        char t=(char)(8+ch);
        System.out.println(t);
        t=(char)(t-8);
        System.out.println(t);
    }
}
