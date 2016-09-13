package com.company;

import java.util.Scanner;
import java.util.Random;



public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Hangman");

        String randomWord = getRandomWord();           // stores the random word under variable randomWord
        String replaceCheck = starReplace(randomWord);  // calls the method to replace randWord with stars
        System.out.print(replaceCheck);


//        public static String hasWon(String replaceCheck) {
        int guess = 10;
        boolean userWon = false;             //this method determines whether or not the player has won
        while (guess > 0 && !userWon) {
            if (replaceCheck.indexOf('*', 0) == -1) {
                userWon = true;
                System.out.print("You have won the game, thank you for playing");
            }


            char userGuess = getUserInput();
            for (int i = 0; i < randomWord.length(); i++) {             //this calls on method that gets our guess, and then if the guess appears in the word, it replaces the * with the guess
                if (userGuess == randomWord.charAt(i)) {
                    replaceCheck = replaceCheck.substring(0, i) + userGuess + replaceCheck.substring(i + 1);
                }
            }
            guess = guess - 1;           // this ends the game
            if (guess == 0) {
                System.out.print("you have no more guesses left. " + "The word was:    " + randomWord + "   Thank you for playing!");
            }
            System.out.print("The word is " + replaceCheck + " you have " + guess + " guesses left ");                          //I NEED TO UNDERST HOW IT IS THAT I CAN AVOUD PRINTING TE
        }
    }


//        }

    public static String getRandomWord() {                                     //this method selects a random word to be used for the game, out of the list of words
        String test_Array[] = {"hello", "toaster", "oven", "my", "only", "friend"};
        Random rn = new Random();
        int randNum = rn.nextInt(test_Array.length);
        return test_Array[randNum];
    }


    public static String starReplace(String ranWord) {                    // this method replaces the random word with the appropriate number of stars
        char[] ranWordChars = ranWord.toCharArray();
        for (int i = 0; i < ranWord.length(); i++) {
            ranWordChars[i] = '*';

        }
        ranWord = String.valueOf(ranWordChars);

        return ranWord;

    }
    public static char getUserInput () {             //this method takes the users guess and stores it in the variable guessPrompt
        System.out.println("\n"+ "Please enter a guess");
        Scanner sc = new Scanner(System.in);
        char guessPrompt = sc.next().charAt(0);
        return guessPrompt;
    }

}











