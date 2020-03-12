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

	     number =1;
        System.out.println(number%12);

        number = 2;
        System.out.println(number%12);

        number = 3;
        System.out.println(number%12);

        number = 4;
        System.out.println(number%12);

        number = 5;
        System.out.println(number%12);

         number =6;
        System.out.println(number%12);

         number =7;
        System.out.println(number%12);

         number =8;
        System.out.println(number%12);

         number =9;
        System.out.println(number%12);

         number =10;
        System.out.println(number%12);

         number =11;
        System.out.println(number%12);

         number =12;
        System.out.println(number%13);




    }
}
