package com.company;

import java.util.Scanner;
import java.util.Random;



public class hangerman {

    public static void main(String[] args) {
    System.out.println("Welcome to Hangman");

    String randomWord = getRandomWord();           // stores the random word under variable randomWord
    String replaceCheck = starReplace(randomWord);  // calls the method to replace randWord with stars
        gameRunner(10,false,replaceCheck,randomWord);
    }


    public static void gameRunner(int guess,boolean userWon,String replaceCheck,String randomWord){
        System.out.print(replaceCheck);
        while (guess > 0 && !userWon) {
            replaceCheck =letterreplaceStar(randomWord, replaceCheck);
            guess=gameender( guess, randomWord, replaceCheck);
            userWon=didWin( replaceCheck, userWon);

        }

    }





    public static int gameender(int guess, String randomWord,String replaceCheck) {
        guess = guess - 1;           // this removes users turns and ends the game
        if (guess == 0) {
            System.out.print("you have no more guesses left. " + "The word was:    " + randomWord + "   Thank you for playing!");
        }
        else if(guess>0){
            System.out.print("The word is " + replaceCheck + " you have " + guess + " guesses left ");
        }
        return guess;
    }

    public static boolean didWin (String replaceCheck,boolean userWon) {    //this method determines whether the user has won
        if (replaceCheck.indexOf('*', 0) == -1) {
            userWon = true;
            System.out.print("You have won the game, thank you for playing");
        }
        return userWon;

    }


    public static String letterreplaceStar(String randomWord, String replaceCheck){
        char userGuess = getUserInput();
        for (int i = 0; i < randomWord.length(); i++) {      //this calls on method that gets our guess, and then if the guess appears in the word, it replaces the * with the guess
            if (userGuess == randomWord.charAt(i)) {
                replaceCheck = replaceCheck.substring(0, i) + userGuess + replaceCheck.substring(i + 1);
            }
        }
        return replaceCheck;
    }






    public static String getRandomWord() {                 //this method selects a random word to be used for the game, out of the list of words
        String test_Array[] = {"hello", "toaster", "oven", "my", "only", "friend"};
        Random rn = new Random();
        int randNum = rn.nextInt(test_Array.length);
        return test_Array[randNum];
    }


    public static String starReplace(String ranWord) {         // this method replaces the random word with the appropriate number of stars
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
        char guessPrompt = sc.next().toLowerCase().charAt(0);
        while (guessPrompt < 'a' || guessPrompt > 'z') {
            System.out.println("characters only idiot");
            System.out.println("\n"+ "Please enter a guess");
            guessPrompt = sc.next().toLowerCase().charAt(0);

        }
        return guessPrompt;
    }

}

