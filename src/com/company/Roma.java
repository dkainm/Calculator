package com.company;

import java.util.Scanner;

public class Roma {
    static String first;
    public static int one;
    static String sec;
    public static int two;
    public static void start () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        first = scan.nextLine();
        transformationOne();
        System.out.println("Enter the second number:");
        sec = scan.nextLine();
        transformationTwo();
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
        System.out.println("");
        end();


    }
    static int one () {
        return 1;
    }
    static int two () {
        return 2;
    }
    static int three () {
        return 3;
    }
    static int four () {
        return 4;
    }
    static int five () {
        return 5;
    }
    static int six () {
        return 6;
    }
    static int seven () {
        return 7;
    }
    static int eight () {
        return 8;
    }
    static int nine () {
        return 9;
    }
    static int ten () {
        return 10;
    }

    static void transformationOne () {
        switch (first) {
            case "I":
                one = one();
                break;
            case "II":
                one = two();
                break;
            case "III":
                one = three();
                break;
            case "IV":
                one = four();
                break;
            case "V":
                one = five();
                break;
            case "VI":
                one = six();
                break;
            case "VII":
                one = seven();
                break;
            case "VIII":
                one = eight();
                break;
            case "IX":
                one = nine();
                break;
            case "X":
                one = ten();
                break;
                default:
                    System.out.println("Please select between I and X");
                    start();
        }
    }
    static void transformationTwo () {
        switch (sec) {
            case "I":
                two = one();
                break;
            case "II":
                two = two();
                break;
            case "III":
                two = three();
                break;
            case "IV":
                two = four();
                break;
            case "V":
                two = five();
                break;
            case "VI":
                two = six();
                break;
            case "VII":
                two = seven();
                break;
            case "VIII":
                two = eight();
                break;
            case "IX":
                two = nine();
                break;
            case "X":
                two = ten();
                break;
            default:
                System.out.println("Please select between I and X");
                start();
        }
    }
    static void end () {
        Scanner scan = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("(1) - again with roman numbers");
        System.out.println("(2) - select arabic numbers");
        int end = scan.nextInt();
        switch (end) {
            case 1:
                start();
                break;
            case 2:
                Arabic.start();
                break;
            default:
                System.out.println("You can select only between '1' and '2'");
                end();
        }
    }

}
