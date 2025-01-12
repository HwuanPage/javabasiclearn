package javalearning.ch02;

import java.util.Scanner;

/**
 * javabasementstudy - CalculateAreas
 * create date  12.01.2025
 * last update  12.01.2025
 * author       gigol
 * purpose      get width,height-> calculate area
 *
 */
public class CalculateAreas {

    Scanner in = new Scanner(System.in);
    Double x,y,area=0.0;
    public void process(){
        System.out.println("This program is for getting area size");
        System.out.println("put width");
        x=in.nextDouble();
        System.out.println("put height");
        y=in.nextDouble();
        area=x*y;
        System.out.printf("Area size is %f\n",area);
    }
}
