package com.company;
import java.util.Scanner;
public class Library {
    Scanner sc = new Scanner(System.in);

    void showAvailableBooks() {

        String s[] = {"the world", "do not enter in ", "how to win in life", "Harry potter"
                , "Alice in the wonderland", "the jungle book",
                "Dracula", "the wind blows dont follow!!"};
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }
    }

    void addbook() {
        System.out.println("Enter ur book name !!! to add it ");
        String a = sc.nextLine();
        System.out.println("thank you it will be added soon !!!");
    }
    void issuebook()
    {
        System.out.println("number of books you want to issue  ?? \n enter plss ");
        int k=sc.nextInt();
        System.out.println("the names of the book ??");
        String str[]=new String[k];
        for(int i=1;i<=k;i++)
        {
             str[i] =sc.nextLine();
            System.out.print(str[i]);
        }
    }
    void returnbook()
    {
        System.out.println("can you enter number of books u are returning pls !!");
        int b=sc.nextInt();
        System.out.println("can you enter the book name you are returning plss !!");
        for(int i=1;i<=b;i++)
        {
            String c=sc.nextLine();
            System.out.println(c);
        }
        System.out.println("thank you for returning !!!");
    }

    static void main() {
        Library obj=new Library();
        obj.showAvailableBooks();
            obj.addbook();
            obj.issuebook();
            obj.returnbook();
        }
    }




