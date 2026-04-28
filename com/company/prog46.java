package com.company;
interface TvRemote
{
    void offTv();
    void buttons();
}
interface SmartTvRemote extends TvRemote
{
    void enterapps();
    void recording();
}
class Tv implements TvRemote
{
    public void offTv()
    {
        System.out.println("offing the tv...");
    }
     public void buttons()
    {
        System.out.println("using the buttons to use the tv...");
    }

}
public class prog46 {
    static void main() {
        Tv obj=new Tv();
        obj.offTv();
        obj.buttons();
    }
}
