package javalearnMain;

import javalearning.ch02.CalculateAreas;
import javalearning.ch02.DivideEven;

import java.util.Scanner;

/**
 * javabasementstudy - ControlAll
 * create date:    2025-01-12
 * last update:    2025-01-12
 * author:  gigol
 * purpose: to control all assignment
 */
public class ControlAll {
    public static void main(String[] args){
        Scanner in =  new Scanner(System.in);
        System.out.println("put a number to execute program now available:[ 2 ]");
        int num = in.nextInt();
        switch (num){
            case 2:
            {
                CalculateAreas cal = new CalculateAreas();
                cal.process();
                System.out.println("move to next program");
                DivideEven div= new DivideEven();
                div.process();
                break;
            }
        }


    }
}
