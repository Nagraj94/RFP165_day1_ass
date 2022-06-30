package com.bridgelabz.basics;

import java.util.Scanner;

public class CommandLine {
    public static void main(String[] args) {
        String name;
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        System.out.println("you have entered " + name);
    }
}
