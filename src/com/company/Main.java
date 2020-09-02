package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
                System.out.println("Hello, I am Eliza, What is your name? ");
                String name = input.nextLine();

                System.out.println("Hi " + name + " ,how are you doing?");
                String doing = input.nextLine();

                System.out.println("What do you wish to discuss?");
                String discuss = input.nextLine();


	
    }
}
