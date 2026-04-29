package com.company;
import java.util.Scanner;
class cellphone
{
   void ring()
    {
        System.out.println("ringing !!!");
    }
    void vibrating()
    {
        System.out.println("vibrating !!");
    }
}
public class prog47 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        cellphone obj = new cellphone();
        obj.ring();
        obj.vibrating();
    }
}
