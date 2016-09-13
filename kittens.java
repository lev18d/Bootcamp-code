
package com.company;

import java.util.Scanner;
import java.util.Random;



public class kittens {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please type your # ");
        Random ran = new Random();
        int number = input.nextInt();

        int[] myArray = new int[number];

        for (int i = 0; i <= myArray.length - 1; i++) {
            int rannn = ran.nextInt(50) +1;
            myArray[i]=rannn;
            System.out.println(myArray[i]);
        }
        int maxValue = myArray[0];
        for(int i=1; i<myArray.length; i++){
            if(myArray[i]>maxValue){
                maxValue=myArray[i];
            }
        }
        int minValue = myArray[0];
        for(int i=1;i< myArray.length;i++){
            if(myArray[i]<minValue){
                minValue = myArray[i];
            }
        }
        System.out.println("The max value is "+ maxValue);
        System.out.println("The min value is "+ minValue);
    }
}