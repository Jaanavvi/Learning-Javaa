package com.company;
import java.util.Scanner;
public class prog15
{
    static void main() {
      Scanner sc=new Scanner(System.in);
      int s1=sc.nextInt();
      int s2=sc.nextInt();
      int s3=sc.nextInt();
      double per=s1+s2+s2*100/300;
      double p1=s1*100/100;
      double p2=s2*100/100;
      double p3=s3*100/100;
      if(p1>=33&&p2>=33&&p3>=33)
      {
          if(per>=40)
              System.out.println("pass");
      }
      else
          System.out.println("fail");

    }
}
