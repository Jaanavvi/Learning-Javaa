package com.company;
import java.util.Scanner;
class Square
{

    int s=0;
    Square()
    {
         s=5;
    }
    void area()
    {
       int area=s*s;
        System.out.println("area "+area);
    }
    void perimeter()
    {
        int peri=4*s;
        System.out.println("perimeter "+peri);
    }

}
public class prog55 {
    static void main() {
        Square obj=new Square();
        obj.area();
        obj.perimeter();
    }

}
