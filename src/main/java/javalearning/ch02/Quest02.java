package javalearning.ch02;

import java.util.Scanner;

/**
 * javabasementstudy - Quest02
 * create date:    2025-01-12
 * last update:    2025-01-12
 * author:  gigol
 * purpose: quest of ch02
 */
public class Quest02 {
    Scanner in = new Scanner(System.in);
    int loadnum,num=0;
    public void questloader(){
        while(true){
            System.out.println("plz enter number of quest available now[ 1 to 9]");
            loadnum= in.nextInt();
            switch (loadnum){
                case 1:
                    makeTree();
                    continue;
                case 2:
                    getdoublesquare();
                    continue;
                case 3:
                    getCylinderVolume();
                    continue;
                case 4:
                    getTime();
                    continue;
                case 5:
                    upperchange();
                    continue;
                case 6:
                    farenhiteToCelcius();
                    continue;
                case 7:
                    divideFiveorFour();
                    continue;
                case 8:
                    addAllNumber();
                    continue;
                case 9:
                    graduationCheck();
                    continue;
                default:
                    break;
            }
            break;
        }

    }
    //1st
    public void makeTree(){
        System.out.println("make Tree!");
        System.out.println("    *    ");
        System.out.println("   ***   ");
        System.out.println("  *****  ");
        System.out.println(" ******* ");
        System.out.println("*********");
    }
    //2nd
    public void getdoublesquare(){
        System.out.println("get dublesquared! Enter a number");
        num=in.nextInt();
        System.out.printf("double-squared of %d is %d\n",num,(int)Math.pow(num,2));
    }
    //3rd
    public void getCylinderVolume(){
        System.out.println("get volume of cylinder! Enter a raidus");
        double rad= in.nextDouble();
        System.out.println("Enter a height");
        double height = in.nextDouble();
        System.out.printf("the volume of cylinder is %f\n",3.14*height*Math.pow(rad,2));
    }
    //4th
    public void getTime(){
        System.out.println("get Time! Enter a number of sec! I'll change as HH:MM:SS");
        num=in.nextInt();
        System.out.printf("Time is %d:%d:%d\n",num/3600,(num%3600)/60,num%60);
    }
    //5th
    public void upperchange(){
        char c= 'c';
        System.out.printf("change lower char to upper! char is %c\n",c);
        num=(int)'A'-(int)'a'+(int)c;
        c=(char)num;
        System.out.printf("upper char of origin is %c\n",c);
    }
    //6th
    public void farenhiteToCelcius(){
        System.out.println("Farenhite to Celcius! Enter a num");
        double temp = in.nextDouble();
        System.out.printf("It is %f Celcius now\n",5*(temp-32)/9);
    }
    //7th
    public void divideFiveorFour(){
        boolean ans;
        System.out.println("Divide num as 4 or 5 or both of them. Enter a number");
        num=in.nextInt();
        ans=(num%4==0)||(num%5==0);
        String result = ans?"true":"false";
        System.out.println(result);
    }
    //8th
    public void addAllNumber(){
        int answer=0;
        System.out.println("add all number of each position.Enter a number0~999");
        num=in.nextInt();
        answer= (num/100)+((num-(num/100*100))/10)+(num%10);
        System.out.printf("sum of all number is %d\n",answer);
    }
    //9th
    public void graduationCheck(){
        int sum=0;
        System.out.println("You have to listen at least 140 credit hours for graduate!");
        System.out.println("Enter your major credit hours");
        sum+=in.nextInt();
        System.out.println("Enter your liberal arts credit hours");
        sum+=in.nextInt();
        System.out.println("Enter your general credit hours");
        sum+=in.nextInt();
        String result=sum>=140?"congratulation":"do more study";
        System.out.println(result);
    }
}
