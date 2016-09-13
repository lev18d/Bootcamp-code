package com.company;
/**************************************
 * Importing the necessary libraries
 ************************************/
import java.util.Scanner;


public class Sentence{
    public static void main(String[] args) throws Exception {
        System.out.println("Please Enter a Line");
        Scanner in = new Scanner(System.in);
        //Splitting the user line into an array
        String[] userLine = in.nextLine().split(" ");
        int userChoise = 0;
        do{
            //Display the main menu of the program
            System.out.println("Please choose an option:");
            System.out.println("1. Display my original sentence");
            System.out.println("2. Display a word at a specific index");
            System.out.println("3. Display word count");
            System.out.println("4. Display letter count");
            System.out.println("5. Display longest word");
            System.out.println("6. Display shortest word position");
            System.out.println("7. Display Reversed sentence");
            System.out.println("8. Is my sentence lexicographically ordered?");
            System.out.println("0. Exit");

            userChoise = in.nextInt();
            switch(userChoise){
                case 1:
                    //TODO:
                    // Displays the original user's line.
                    // Reconstruct the line using the 'userLine' array
                    String userLineStr =  getUserLineAsString(userLine);
                    System.out.println(userLineStr);
                    break;
                case 2:
                    //TODO:
                    // Ask the user for the relevant word index.
                    // Validate the given index (must be an integer and less than to the user line length).
                    int wordIndex = getRequestedIndexFromUser(userLine);
                    displaySpecificWord(userLine,wordIndex);
                    break;
                case 3:
                    //TODO:
                    //Display the number of words in the user sentence
                    int wordCount = getWordCount(userLine);
                    System.out.println(wordCount);
                    break;
//                case 4:
//                    //TODO:
//                    // Display the number of letters in the user's sentence
//                    // In this case space is not a character. (try to use existing methods)
//                    int letterCount = getLetterCount(userLine);
//                    System.out.println(letterCount);
//                    break;
//                case 5:
//                    //TODO:
//                    // Display the longest word in the user's sentence.
//                    // If there is more than one, display the last.
//                    String longestWord = getLongestWord(userLine);
//                    System.out.println(longestWord);
//                    break;
//                case 6:
//                    //TODO:
//                    // Display the index of the shortest word in the user's sentence.
//                    // If there is more than one display the first.
//                    int shortestWordIndex = getShortestWordIndex(userLine);
//                    System.out.println(shortestWordIndex);
//                    break;
//                case 7:
//                    //TODO: Display the reversed sentence (do not reverse the letters)
//                    System.out.println(reverseSentence(userLine));
//                    break;
//                case 8:
//                    //TODO:
//                    // 'True' if the sentence is lexicographically ordered (ascending)
//                    // Use ascii to determine which letter is bigger
//                    // Otherwise 'False'
//                    boolean result= isLexicographicallyOrdered(userLine);
//                    if (result){
//                        System.out.println("Your sentence is lexicographically ordered");
//                    }else{
//                        System.out.println("Your sentence is NOT lexicographically ordered");
//                    }
//                    break;
//                case 0:
//                    System.out.println("Bye");
//                    break;
//                default:
//                    System.out.println("No such option! try again");
//                    break;
            }
        }while(userChoise!=0);
        in.close();
    }
    public static String getUserLineAsString(String[] userLine){  //1
        String Stringer=" ";
        for(int i=0;i<userLine.length;i++){
            Stringer=Stringer + " " + userLine[i];
        }
        return Stringer;
    }
    public static int getRequestedIndexFromUser(String[] userLine) {  //2
        System.out.print("Using a number to represent a word in the sentence you entered, please type a number (starting from 0 as the first word) so that you can access a certain word in your sentence. ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        while ((a > userLine.length - 1 || a < 0)) {
            System.out.print("Please give me a valid number that is equal to or less than the number of words in your sentence, and is larger than 0");
            a = in.nextInt();
        }
        return a;
    }
    public static String displaySpecificWord(String[] userLine,int wordIndex){  //2 maybe instead of int wordIndex, it is supposed to be a
        System.out.print(userLine[wordIndex]);
        return userLine[wordIndex];
    }

    public static int getWordCount(String[] userLine){   //3
        int counter=0;
        for(int i =0; i<userLine.length;i++) {
            counter++;
        }
        return counter;

    }

// this one is number 7
//    public static String getUserLineAsString(String[] userLine){
//        String Stringer=" ";
//        for(int i=0;i<userLine.length;i++){
//            Stringer=userLine[i]+ " "+ Stringer;
//        }
//        return Stringer;
//    }
}