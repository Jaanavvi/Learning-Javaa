package com.company;
import java.util.Scanner;
public class prog17
{
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to find out say of the week ");
        int k=sc.nextInt();
        switch(k)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thrusday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("wrong number!!!");
                break;





        }
        
    }
}
