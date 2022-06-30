package com.bridgelabz.basics;

import java.util.Scanner;

public class TwoStringEquals {

    public static void main(String[] args) {
        String a1;
        String a2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string ");
        a1 = sc.next();
        System.out.println("enter second string ");
        a2 = sc.next();
        if (a1 == a2)
            System.out.println("you have entered string are equal to each other ");
        else
            System.out.println("you have entered string are not equal to each other ");
    }
}
