package com.company;
import java.util.Scanner;
public class prog19
{
    static void main() {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      if(s.endsWith(".com"))
          System.out.println("commercial website");
      else if(s.endsWith(".org"))
          System.out.println("organisation website");
      else if(s.endsWith(".in"))
          System.out.println("Indian website");

    }
}
