package HL_1.Section_06;

import java.util.*;
import static java.lang.System.out;

public class GuessingGame
{
    // instance variables
    private int number;      // the random number
    private int myGuess;     // current guess
    private int numGuesses;  // number of guesses

    private Scanner keyboard = new Scanner(System.in);

    /** generates a random number in the range of
     *  1 to 100 inclusive.
     */
    public void generateNumber()
    {
        number = (int)((Math.random() * 100) + 1);
        out.println("number: " + number);
                
    }

    /** Displays a prompt asking player to make a guess. It
     *  reads the guess and stores it in the variable
     *  myGuess. It also increments the variable numGuesses.
     */
    public void makeGuess()
    {
        numGuesses = numGuesses + 1;
        
        Scanner keyboard = new Scanner(System.in);
        
        out.print("Enter a number (1:100): ");
        myGuess = keyboard.nextInt();
        winner();
    }

    /* Determines whether player's guess was correct. If
     * myGuess was a match it returns true. If myGuess was
     * less than number then it displays the message
     * "Too Low, Try Again!" and returns false. If myGuess
     *  was greater than number then it displays the
     *  message "Too High, Try Again!" and returns false.
     */
    public boolean winner()
    {        
        
        if (myGuess < number) {
            
            out.println("Too low! Try again!");
            return false;
            
        } else if (myGuess > number) {
            
            out.println("Too high! Try again!");
            return false;
            
        }
        
        return true;
    }
	
    /** Generates the random number then allows the player to
     *  continually guess the random number until it is found.
     *  Once the number is found it displays a message
     *  indicating how many guesses it took to find the
     *  number.
     */
    public void playGame()
    {
        generateNumber();
        makeGuess();
        
        while (winner() != true) 
            makeGuess();
        
        out.println("You won!");
        out.println("Number of guesses: " + numGuesses + "\n");
    }

    public static void main (String[] args)
    {
        GuessingGame app = new GuessingGame();
        app.playGame();
    }
}