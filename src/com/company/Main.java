package com.company;

import java.util.Scanner;

public class Main {

    public static void ModulusClock(){}

    public static void main(String[] args) {
        String hours;
        String minutes;
	Scanner key;
	key = new Scanner(System.in);
	System.out.println("Give me a number between 1-12");
	hours = key.nextLine();
	System.out.println("Give me a number between 1-60");
	minutes = key.nextLine();
	System.out.println("The time is "+hours + minutes);
	int number = 45;
	String answer = number > 60 ? "Greater than 60" : "Less than or equal to";
	System.out.println(" The answer is: "+ answer);
    }
}
