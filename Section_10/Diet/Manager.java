package HL_1.Section_10.Diet;

import static java.lang.System.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author 660741
 */

public class Manager {
    
    Scanner keyboard;
    Diet diet;
    String sel;
    
    public Manager() {
        
        keyboard = new Scanner(in);
        diet = new Diet();
        
    }
    
    public void clear() {
        
        for(int clear = 0; clear < 100; clear++) {
            
            out.println("\b");
            
        }
    }
    
    public void mainMenu() {
        
        out.println("-----------------------------");
        out.println("\t Main Menu");
        out.println("-----------------------------");
        out.println();
        out.print("Select one of the following \n"
                + "--------------------------- \n" +
                  "1: Add a record \n" + 
                  "2: View a record \n" +
                  "3: View all records \n" +
                  "4: Exit Main Menu \n");
        out.println();
        out.print("Your selection (int only): ");
        sel = keyboard.nextLine();
        out.println();
        
        switch (sel) {
            
            case "1":
            {addRecord();}
            break;
            
            case "2":
            {viewRecord();}
            break;
            
            case "3":
            {viewAllRecords();}
            break;
            
            case "4":
            {exit();}
            break;
            
            default:
            {out.println("Resetting time machine. Please hold...");
            
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Time machine is broken. Leaving program.");
                System.exit(-1);
            }
            clear();
            mainMenu();
            }
        }    
        
    }
    
    public void addRecord() {
        
        clear();
        
        String date;
        int weight;
        
        String answer = "";
        
        out.println();
        out.println("====================");
        out.println("\t Add Records    ");
        out.println("====================");
        
        out.println();
        
        
        
        out.print("Enter date (M/D/Y): ");
        date = keyboard.nextLine();
        out.print("Enter weight (int): ");
        weight = keyboard.nextInt();
        keyboard.nextLine();
        
        Entry entry = new Entry(date, weight);
        diet.addEntry(entry);
        
        out.print("Add another record? (y/n): ");
        answer = keyboard.nextLine();
                
        if(answer.equals("y")) {
            addRecord();
        }
        
        clear();
        mainMenu();
    }
    
    public void viewRecord() {
        
        clear();
        
        String date = "";
        String answer;
        
        out.println();
        out.println("====================="); 
        out.println("\t View Record");
        out.println("=====================");
        
        out.print("Enter date (M/D/Y): ");
        date = keyboard.next();
        
        if(diet.getEntry(date) != null) {
            
            out.println("Weight \t = " + (diet.getEntry(date)).getWeight());
            out.println();
            out.print("Find another entry? (y/n): ");
            answer = keyboard.next();
            
            if(answer.equals("y"))
                viewRecord();
            
        } else {
            
            out.print("Entry does not exist. Create it? (y/n):");
            answer = keyboard.next();
            
            if(answer.equals("y")) 
                addRecord();
        
        clear();
        mainMenu();
        
        }
    }
        
    
    public void viewAllRecords() {
        
        clear();
        
        diet.viewList();
        
        out.println();
        out.println("Enter 'y' to continue...: ");
        String answer = keyboard.next();
        
        if(answer.equalsIgnoreCase("y")) {
            
//            clear();
            mainMenu();
        
        }
    }
    
    public void exit() {
       
        String answer;
        
        out.println();
        out.print("Are you sure? (y/n): ");
        answer = keyboard.next();
        
        if(!answer.equalsIgnoreCase("y")) {
            mainMenu();
        }
        keyboard.close();
    }
    
    public static void main(String[] args) {
        
        Manager app = new Manager();
        app.mainMenu();
        
    }
    
    
}
