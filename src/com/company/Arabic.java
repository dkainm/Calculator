package com.company;

import java.util.Scanner;

public class Arabic {
    public static void start () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        Roma.one = scan.nextInt();
        System.out.println("Enter second number:");
        Roma.two = scan.nextInt();
        System.out.println("Select an action:");
        System.out.println("(1) - '+'");
        System.out.println("(2) - '-'");
        System.out.println("(3) - '*'");
        System.out.println("(4) - '/'");
        int action = scan.nextInt();
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
        end();

    }
    static void end () {
        Scanner scan = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("(1) - again with arabic numbers");
        System.out.println("(2) - select roman numbers");
        int end = scan.nextInt();
        switch (end) {
            case 1:
                start();
                break;
            case 2:
                Roma.start();
                break;
            default:
                System.out.println("You can select only between '1' and '2'");
                end();
        }
    }
}
