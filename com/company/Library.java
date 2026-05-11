package com.company;
import java.util.Scanner;
public class Library {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String k = sc.next();
        switch (k) {

            case "showAvailableBooks": {
                String s[] = {"the world", "do not enter in ", "how to win in life", "Harry potter"
                        , "Alice in the wonderland", "the jungle book",
                        "Dracula", "the wind blows dont follow!!"};
                for (int i = 0; i < s.length; i++) {
                    System.out.println(s[i]);
                }
            }

            break;

            case "addbook": {
                System.out.println("Enter ur book name !!! to add it ");
                sc.nextLine();
                String a = sc.nextLine();
                System.out.println("thank you it will be added soon !!!");
            }
            break;

            case "issuebook": {
                System.out.println("number of books you want to issue  ?? \n enter plss ");
                int z = sc.nextInt();
                System.out.println("the names of the book ??");
                String str[] = new String[z];
                for (int i = 1; i <= z; i++) {
                    sc.nextLine();
                    str[i] = sc.nextLine();
                    System.out.print(str[i]);
                }
            }
            break;
            case "returnbook": {
                System.out.println("can you enter number of books u are returning pls !!");
                int b = sc.nextInt();
                System.out.println("can you enter the book name you are returning plss !!");
                for (int i = 1; i <= b; i++) {
                    sc.nextLine();
                    String c = sc.nextLine();
                    System.out.println(c);
                }
                System.out.println("thank you for returning !!!");
            }
            break;
            default:
                System.out.println("wrong choice!!! try again ");
        }
    }

}