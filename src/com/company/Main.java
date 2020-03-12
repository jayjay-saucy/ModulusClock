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

int number = 12;
	System.out.println(number%12);


int min = 60;
System.out.println(min%60);

    }
}
