package com.bridgelabz.basics;

import java.util.Scanner;

public class LeapYear {

    static int year(){
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year to find out leap year ");
        year = sc.nextInt();

        if(year>=1582)
            if (year % 4 == 0 && year % 400 == 0 ||  year % 100 == 0)
            {
                System.out.println("you have entered leap year");
                return year;
            }
            else
            {
                System.out.println("entered year is not a leap year");
                return year;
            }
        else
            System.out.println("enter year greater than 1582");
        return year();
    }

    public static void main(String[] args) {

        year();
    }
}
