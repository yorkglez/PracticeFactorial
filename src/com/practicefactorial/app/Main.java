package com.practicefactorial.app;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Variable declaration
        long factorial = 1;
        int number = -1;

        //Object construction
        Scanner in = new Scanner(System.in);

        do
        {
            System.out.print("Number to calculate factorial: ");
            number = in.nextInt();

            if(number <= 0)
            {
                System.out.print("You must input a positive value");
            }

            factorial = Factorial(number);
            System.out.print(String.format("The factorial of %d is %d \nwhich is gotten by multiplying several times %d",number, factorial, number));
        }while(number <= 0);
    }

    public static long Factorial(int n)
    {
        long fact = 1;
        while(n != 0){
            fact = fact * n;
            n--;
        }
        return  fact;
    }
}
