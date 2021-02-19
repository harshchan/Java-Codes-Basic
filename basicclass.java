package com.company;

import java.io.DataInputStream;
import java.util.Locale;

public class basicclass {
    public static void main(String[] args){
//        int x,y;
//        //take input from  user
//        DataInputStream in = new DataInputStream(System.in);
//        String username="";
//        do {
//            try {
//                System.out.println("hello, enter your name");
//                username = in.readLine();
//                System.out.println("hello " + username);
//                System.out.println("enter two numbers");
//                //x=in.readInt();
//                //y=in.readInt();
//                x = Integer.parseInt(in.readLine());
//                y = Integer.parseInt(in.readLine());
//                System.out.println("the sum of two numbers are " + (x + y));
//
//            }
//            //
//            catch (Exception e) {
//                System.out.println("some error lolll");
//            }
//        }while(!username.equals("harsh"));

        String str1="hello";
        String str2="world";
        String res;
//        System.out.println(str1.toLowerCase());
//        System.out.println(str1.charAt(3));

        StringBuffer s1=new StringBuffer("Object Oriented Programming");
        StringBuffer s2=new StringBuffer("heelo");
        System.out.println(s1.capacity());
        System.out.println(s1.length());




    }
}
