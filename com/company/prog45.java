package com.company;
abstract class Telephone
{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone
{
    void ring()
    {
        System.out.println("ringing!!");
    }
    void lift()
    {
        System.out.println("picking up the call..lifting ");
    }
    void disconnect() {
        System.out.println("the call has been disconnected ");
    }
}
public class prog45
{
    static void main() {
        Telephone obj=new SmartTelephone();
        obj.disconnect();
        obj.lift();
        obj.ring();
    }
}
