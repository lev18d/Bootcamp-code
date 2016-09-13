package com.company;

/**
 * Created by itc_user on 5/8/2016.
 */

import java.util.Scanner;
public class giget {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert numerical value between 0 and 9: ");
        int s = sc.nextInt();

        if (s == 0) {
            System.out.print("ZERO");
        }
        else if (s == 1) {
            System.out.print("ONE");
        }
        else if (s == 2) {
            System.out.print("TWO");
        }
        else if (s == 3) {
            System.out.print("THREE");
        }
        else if (s == 4) {
            System.out.print("FOUR");
        }
        else if (s == 5) {
            System.out.print("FIVE");
        }
        else if (s == 6) {
            System.out.print("SIX");
        }
        else if (s == 7) {
            System.out.print("SEVEN");
        }
        else if (s == 8) {
            System.out.print("EIGHT");
        } else if (s == 9) {
            System.out.print("NINE");
        }
    }
}


