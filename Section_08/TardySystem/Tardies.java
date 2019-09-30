package HL_1.Section_08.TardySystem;

import java.util.Scanner;
import static java.lang.System.*;

public class Tardies
{
    // instance variables
    private Student[] students;    // list of students
    private int numStudents;       // logical size of the array
    int totalTardies;
    
    // constructor
    public Tardies()
    {
        students = new Student[50];   // instantiate array
        numStudents = 0;               
    }
	
    /** precondition: none
     *  postcondition: students array has been populated with
     *     Student objects from keyboard input. numStudents has 
     *     been updated to reflect the logical size of the 
     *     array student.
     */
    public void enterData()
    {
        String answer = "y";
        
        Scanner keyboard = new Scanner(in);
        out.println("======================");
        out.println("  Student Data Entry  ");
        out.println("======================");
        
        do{
        out.print("Enter last name: ");
        String lastName = keyboard.next();
        out.print("Enter first name: ");
        String firstName = keyboard.next();
        out.print("Tardies received: ");
        int tardies = keyboard.nextInt();
        
        out.println();
        out.print("Enter another student? (y/n):");
        answer = keyboard.next();
        out.println();
        
        students[numStudents] = new Student(lastName, firstName, tardies);
        numStudents++;
        
        totalTardies += tardies;
        } while (answer.equals("y"));
        
    }

    /* @return the total number of tardies for all students
     *    in the class.
     */
    public int getTotalTardies()
    {
	return totalTardies;
    }
	
    /** precondition: none
     *  postcondition: a summary report has been printed which includes
     *     the total number of tardies for the entire class and a
     *     list of names and tardies for every student in the class.
     */
    public void summaryReport()
    {
        out.println("=====================");
        out.println("    Class Summary    ");
        out.println("  Total Tardies: " + totalTardies);
        out.println("=====================");
        
        for(int i = 0; i < numStudents; i++) {
            out.println(students[i]);
        }
    }
    
    public static void main(String[] args)
    {
        Tardies app = new Tardies();
        app.enterData();
        app.summaryReport();
    }
}
