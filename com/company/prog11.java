package com.company;
import java.util.Scanner;
public class prog11
{
    static void main() {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        st=st.replace(' ','_');
        System.out.println(st);
    }
}
