package com.company;
import java.util.Scanner;
public class prog13
{
    static void main() {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int c=0;
        int t=0;
        for(int i=0;i<st.length();i++)
        {

            char ch=st.charAt(i);
            if(ch==' ')
                c++;
            if(c==2||c==3)
                t++;
        }
        System.out.println(t);
    }
}
