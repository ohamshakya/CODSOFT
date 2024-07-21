package codsoft.tasks.task1;

import java.util.Scanner;

public class GuessingGame {
    public static void guessGame() {
        //numbers from 1 to 100
        System.out.println("Welcome to the Guessing Game!!!!!");
        int correctNumber = 1 + (int) (Math.random() * 100);
        Scanner in = new Scanner(System.in);
        int guessNumber = 0;
        int numberOfGuesses = 0;
        while (guessNumber != correctNumber) {
            System.out.println("Enter the guesses");
            guessNumber = in.nextInt();
            if (guessNumber == correctNumber) {
                System.out.println("Congratulations! correct guess");
                System.out.println("Do you want to play again? if yes enter y otherwise n");
                Scanner sc = new Scanner(System.in);
                String strToChar = sc.next();
                char playAgain = strToChar.charAt(0);
                if (playAgain == 'y') {
                    continue;
                } else {
                    break;
                }

            } else if (guessNumber > correctNumber) {
                System.out.println("High guess please guess low numbers");
            } else {
                System.out.println("low guess please guess  high numbers");
            }
            numberOfGuesses++;
            System.out.println("number of guess = " + numberOfGuesses);
            if (numberOfGuesses == 4) {
                System.out.println("Sorry you loose the game Exiting the game....");
                //reseting the number of guesses to give user to guess only 4 times
                numberOfGuesses = 0;
                System.out.println("Do you want to play again: if yes enter y otherwise n");
                Scanner sc = new Scanner(System.in);
                String strToChar = sc.next();
                char playAgain = strToChar.charAt(0);
                if (playAgain == 'y') {
                    continue;
                } else {
                    System.out.println("Exiting the game: Bye!");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("You have only 4 guesses");
        System.out.println("Choose \n1.Enter to the game\n2.Exit the game\n3.Play again");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                guessGame();
                break;
            case 2:
                System.out.println("Exiting from the game");
                break;

            case 3:
                guessGame();
                break;

            default:
                System.out.println("You choose an invalid option");
                break;
        }
    }

}
