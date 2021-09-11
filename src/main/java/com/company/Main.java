package com.company;

import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sean McCormack
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("What is the principal amount? ");
        double initial = Double.parseDouble(scan.nextLine());
        System.out.printf("What is the rate? ");
        double rate = Double.parseDouble(scan.nextLine());
        System.out.printf("What is the number of years? ");
        int years = Integer.parseInt(scan.nextLine());
        System.out.printf("What is the number of times the interest is compounded per year? ");
        int time_year = Integer.parseInt(scan.nextLine());
        double amount = Math.ceil(initial*Math.pow(1+((rate/100)/time_year),(time_year*years))*100)/100;
        System.out.printf("$%.2f invested at %.2f%% for %d years compounded %d times per year is $%.2f",initial,rate,years,time_year,amount);

	// write your code here
    }
}
