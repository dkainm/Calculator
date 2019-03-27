package com.company;

import java.util.Scanner;

public class Main {
    public static void start () {
        System.out.println("Select type of numbers:");
        System.out.println("(1) - roman numbers");
        System.out.println("(2) - arabic numbers");
        Scanner scan = new Scanner(System.in);
        int selection = scan.nextInt();
        switch (selection) {
            case 1:
                Roma.start();
                break;
            case 2:
                Arabic.start();
                break;
            default:
                System.out.println("Please select roman or arabic numbers by buttons '1' of '2'");
                start();
        }

        System.out.println("Select an action:");
        System.out.println("(1) - '+'");
        System.out.println("(2) - '-'");
        System.out.println("(3) - '*'");
        System.out.println("(4) - '/'");
        Scanner in = new Scanner(System.in);
        int action = in.nextInt();
        switch (action) {
            case 1:
                System.out.println("Answer: " + Action.plus());
                break;
            case 2:
                System.out.println("Answer: " + Action.minus());
                break;
            case 3:
                System.out.println("Answer: " + Action.multiply());
                break;
            case 4:
                System.out.println("Answer: " + Action.division());
                break;
        }
        System.out.println("");
        start();

    }

    public static void main(String[] args) {
        System.out.println("Calculator created by Alex Rudoi");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        start();

    }
}
