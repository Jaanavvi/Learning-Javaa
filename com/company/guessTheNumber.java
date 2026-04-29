package com.company;
import java.util.Scanner;

class game
{
    Scanner sc=new Scanner(System.in);
    game()
    {
        int random=(int)(Math.random()*100)+1;
    }
    void TakeUserInput()
    {
        System.out.println("taking input from the user enter a number from 1 to 100 ");
        int u=sc.nextInt();
    }

    void CorrectNumber()
    {

    }


}
public class guessTheNumber {
    static void main() {
        Scanner sc=new Scanner(System.in);
    }
}
