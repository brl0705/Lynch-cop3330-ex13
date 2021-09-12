package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {

        Scanner input1 = new Scanner(System.in);
        System.out.println("What is the principal?");
        int p = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("What is the rate of interest?");
        float r = input2.nextFloat();

        Scanner input3 = new Scanner(System.in);
        System.out.println("How many years?");
        int t = input3.nextInt();

        Scanner input4 = new Scanner(System.in);
        System.out.println("What is the number of times the interest is compounded per year?");
        int n = input4.nextInt();

        float r1=r/100;
        float x = 1+r1/n;
        int y = n*t;
        float x1 = x;
        for (int i = 0; i < y; i++)
        {

            x1 = x1 * x;
        }

        float a = p*x1;

        System.out.println("$" + p + " invested at " + r + "% for " + t + " years compounded " + n + " times per year is $" + a);
    }
}
