package com.company;

/**
 * Created by itc_user on 5/11/2016.
 */

import java.util.Scanner;
import java.util.Random;

public class War {
    public static void main(String[] args) {

        double userMoney= 50;
        double cardh = 0;
        double cardc = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("/////----Welcome To War----/////");

        System.out.println("Please enter your name: ");
        String name = sc.next();


        while(userMoney>0){

            System.out.println("Hello "+name+ " you currently have "+userMoney+" dollars"+"\nPlace your bet for the next round: 1 to 50" );

            int bet = sc.nextInt();                             // lines 28-31 take the user's bet and ensure its within a valid range
            if(!(bet>=1 && bet<=userMoney)){
                System.out.println("invalid input");
                System.exit(0);
            }
            Random r= new Random();                        // lines 33-25 randomize cards for each player
            int randhNumber = r.nextInt(12);
            int randcNumber = r.nextInt(12);

            if (randcNumber>randhNumber){                   // lines 37-44 perform comparisons of the user v computers card numbers
                userMoney = userMoney-bet;
            }
            else if(randcNumber<randhNumber){
                userMoney = userMoney+bet;
            }
            else if(randcNumber==randhNumber){
                userMoney = userMoney-bet;
            }
            System.out.println("Your card is "+randhNumber+ " and my card is "+randcNumber+ " you have "+userMoney );


            if(userMoney==0){                                                        // exit game
                System.out.println("You are broke, "+name+ " please come again");
                System.exit(0);
            }

            System.out.println("Do you still want to play?: yes or no ");
            String answer = sc.next();
            if (answer.equals("yes")) {
                continue;
            }
            else if(answer.equals("no")){
                System.exit(0);
            }


        }

    }
}
