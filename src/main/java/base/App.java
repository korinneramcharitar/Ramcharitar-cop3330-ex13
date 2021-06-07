
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */



package base;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
            double principal, interest;
            int a = 1;
            int compound, years;
            Scanner input = new Scanner(System.in);
            System.out.println("What is the principal amount?");
            principal = input.nextDouble();
            System.out.println("What is the rate?");
            interest = input.nextDouble();
            System.out.println("What is the number of years?");
            years = input.nextInt();
            System.out.println("What is the number of times the interest is compounded per year?");
            compound = input.nextInt();
            DecimalFormat formatter = new DecimalFormat("#0.00");
            double rate = interest /100;
            double num1 = (a+rate/compound);
            double num2 = (compound * years) ;
            double num3 = principal * Math.pow(num1, num2);


            System.out.println("$" + formatter.format(principal) + " invested at " + interest + "% for " + years + " years compounded " + compound + " times per year is $" + formatter.format(num3 )+ ".");
        }
    }
