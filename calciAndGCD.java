package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class calculator {
    float addition(float a, float b) { return a + b;}

    float subtraction(float a, float b) { return a - b; }

    float multiplication(float a, float b) {return a * b;}

    float division(float a, float b) {return a / b;}

    double square(float a, int b) { return Math.pow(a, b);}

    double sqrt(float a) { return Math.sqrt(a);}

    void meanAndVariance() {
        float mean = 0, sum = 0, count = 0;
        double sumv = 0.0, variance = 0.0, sd = 0.0;
        int i = 0;
        String[] x = new String[20];
        Scanner in = new Scanner(System.in);
        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        Scanner scin = new Scanner(System.in);

        try {
            while (x[i] != "end") {
                System.out.println("enter numbers");
                //x[i] = scin.next();
                x[i] = bfrd.readLine();
                if (x[i] == "end") {
                    System.out.println("lol");
                    break;
                }
                if (x[i] != "end") {
                    sum = sum + Integer.parseInt(x[i]);
                    count++;
                    ++i;
                }
            }
        } catch (NumberFormatException e) {
            //System.out.println("error");
            //e.printStackTrace();
        } catch (IOException e) {
            System.out.println("error IO");
        } finally {
            mean = sum / count;
            System.out.println("The average of numbers is" + mean);
            for (i = 0; i < count - 1; i++) {
                sumv = sumv + Math.pow(Integer.parseInt(x[i]) - mean, 2);
            }
            variance = sumv / count;
            sd = Math.sqrt(variance);
            System.out.println("The Variance of entered numbers is " + variance);
            System.out.println("The Standard Deviation is " + sd);
        }
    }
}

public class calciAndGCD {

    static int findGCD(int a, int b) {
        if (b == 0)
            return a;

        return (findGCD(b, a % b));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        calculator c = new calculator() {
        };
        int x = 0, y, h, i;
        float a, b;
        do {
            System.out.println("enter your choice \n 1.calculator \n 2.GCD of 2 numbers\n 0.Exit");
            x = in.nextInt();
            switch (x) {
                case 1:
                    System.out.println("\nMenu\n 1.Addition 2.Subtraction 3.Multiplication 4.Division\n5.power of number 6.Squareroot\n7.Mean and Variance and standard deviation");
                    y = in.nextInt();
                    switch (y) {
                        case 1:
                            System.out.println("Enter 2 numbers");
                            a = in.nextFloat();
                            b = in.nextFloat();
                            System.out.println("Addition of numbers is " + c.addition(a, b));
                            break;
                        case 2:
                            System.out.println("Enter 2 numbers");
                            a = in.nextFloat();
                            b = in.nextFloat();
                            System.out.println("Subtraction of numbers is " + c.subtraction(a, b));
                            break;
                        case 3:
                            System.out.println("Enter 2 numbers");
                            a = in.nextFloat();
                            b = in.nextFloat();
                            System.out.println("Multiplication of numbers is " + c.multiplication(a, b));
                            break;
                        case 4:
                            System.out.println("Enter 2 numbers");
                            a = in.nextFloat();
                            b = in.nextFloat();
                            System.out.println("Division of numbers is " + c.division(a, b));
                            break;
                        case 5:
                            System.out.println("Enter number and its power");
                            a = in.nextFloat();
                            h = in.nextInt();
                            System.out.println("power of number is " + c.square(a, h));
                            break;
                        case 6:
                            System.out.println("Enter  number to find squareroot");
                            a = in.nextFloat();
                            // b=in.nextFloat();
                            System.out.println("squareroot of number is " + c.sqrt(a));
                            break;
                        case 7:
                            c.meanAndVariance();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Enter 2 numbers");
                    h = in.nextInt();
                    i = in.nextInt();
                    System.out.println("GCD of Two numbers is " + findGCD(h, i));
            }
        } while (x > 0);
    }
}
