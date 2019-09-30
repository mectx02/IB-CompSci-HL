package HL_1.Section_08;

import java.util.Scanner;
import static java.lang.System.*;

public class Vowels {
   
    private String[] words = new String[10];
    private int[] vowels = new int[10];
    private int numVowels;
    private String letter;
    
    Scanner keyboard = new Scanner(in);
    
    public void populateWords() {         //creates entry for user to enter ten words
        out.println("Enter ten words."); 
        
        for (int i = 1; i < 11; i++) {
            out.print("Word " + i + ": ");
            words[i - 1] = keyboard.next();
        }
        
        out.println();
    }
    
    public void calculateVowels() {
        
        for (int i = 0; i < 10; i++) {
            numVowels = 0;
            for (int m = 0; m < words[i].length(); m++) {
                letter = words[i].substring(m, m + 1);
                if(letter.equals("a") || letter.equals("e") || letter.equals("i") ||
                        letter.equals("o") || letter.equals("u")) {
                    numVowels++;
                }
                
                vowels[i] = numVowels;
            }
        }
    }
    
    public void printArrays() {
        for (int i = 0; i < 10; i++) {
            out.println(words[i] + " has " + vowels[i] + " vowels.");
        }
    }
    
    public static void main(String[] args)
    {
        Vowels app = new Vowels();
        app.populateWords();
        app.calculateVowels();
        app.printArrays();
    }
}
