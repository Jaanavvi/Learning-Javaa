package com.company;
import java.util.Scanner;
class Circle {
    void r()
    {
        System.out.println("radius is the main thing ");
    }
}
class cylinder extends Circle{
    void h()
    {
        System.out.println("we need height which would be equal to circle's radius " );
    }

}
public class prog58 {
    static void main() {
cylinder obj=new cylinder();
obj.h();
obj.r();

    }
}
