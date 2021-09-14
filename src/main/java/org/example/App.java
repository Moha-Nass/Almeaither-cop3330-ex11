package org.example;

import java.util.Scanner;

/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Mohammed_Almeaither
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Exercise 11 - Currency Conversion");
        double euros, exchangerate,usd;
        System.out.print("How many euros are you exchanging? ");
        Scanner in = new Scanner(System.in);
        euros = Double.parseDouble(in.next());

        System.out.print("What is exchange rate? ");
        exchangerate = Double.parseDouble(in.next());
        usd = exchangerate * euros;
        System.out.println(euros + " euros at an exchange rate of " + exchangerate + " is "+ usd + " U.S.dollars");

    }
}
