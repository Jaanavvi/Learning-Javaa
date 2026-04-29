package com.company;
import java.util.Scanner;
class TommyVeccetti
{
    void hit()
    {
        System.out.println("hitting !!!");
    }
    void run()
    {
        System.out.println("running!!");
    }
    void fire()
    {
        System.out.println("firing!!!");
    }
}
public class prog57 {
    static void main() {
       TommyVeccetti obj=new TommyVeccetti();
       obj.hit();
       obj.run();
       obj.fire();
    }
}
