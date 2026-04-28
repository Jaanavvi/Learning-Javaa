package com.company;
class Monkey
{
    void jump()
    {
        System.out.println("jumpingg");
    }
    void bite()
    {
        System.out.println("bitting");
    }
}
interface BasicAnimal
{
    public void eat();
    public void sleep();

}
class Humans extends Monkey implements BasicAnimal
{
  public void eat ()
  {
      System.out.println("eating");
  }
  public void sleep()
  {
      System.out.println("sleeping");
  }
}

public class prog44
{
    static void main() {
        Monkey obj=new Humans();//polymorphism!!!
        obj.jump();
        obj.bite();
    }
}
