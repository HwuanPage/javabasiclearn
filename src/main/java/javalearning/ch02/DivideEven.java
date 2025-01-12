package javalearning.ch02;

import java.util.Scanner;

/**
 * javabasementstudy - DivideEven
 * create date:    2025-01-12
 * last update:    2025-01-12
 * author:  gigol
 * purpose: get num-> divide a odd or even num
 */
public class DivideEven {
    Scanner in = new Scanner(System.in);
    int number = 0;


    public void process() {
        System.out.println("This program is for dividing odd and even number");
        System.out.println("plz enter any num");
        number = in.nextInt();
        if (number % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }
}

