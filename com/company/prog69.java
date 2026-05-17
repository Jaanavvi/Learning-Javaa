package com.company;
import java.util.Scanner;
class circle
{
    Scanner sc=new Scanner(System.in);
    int r;
    void setradius()
    {
        r=8;
    }
    public int getradius(int n)
    {
       n=r;
        return n;
    }
    void area()
    {
        double a=(22*r*r)/7.0;
        System.out.println("area "+a);
    }
    void perimeter()
    {
        double p=(2*22*r)/7.0;
        System.out.println("perimeter "+p);
    }
}
public class prog69 {
    static void main() {
        circle ob=new circle();
        ob.setradius();
        ob.getradius(8);
        ob.area();
        ob.perimeter();

    }
}
