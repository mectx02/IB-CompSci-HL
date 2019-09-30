package HL_1.Section_07.Dance;

import java.util.*;
import static java.lang.System.out;

public class StudentCouncil
{ 
    // Instance Variables
    private Dance dance;
    private Scanner scan;
    
    // Constructor
    public StudentCouncil()
    {
        dance = new Dance();
        scan = new Scanner(System.in);
    }
    
    // Methods
    public void mainMenu()
    {
        int ans=0;
        
        do
        {
            out.println("======================");
            out.println("        Main Menu");
            out.println("======================");
            out.println("1. Buy a Ticket");
            out.println("2. Print Summary Report");
            out.println("3. Exit");
            out.println();
            out.print("Selection --> ");
            ans = scan.nextInt();
            out.println();
            
            if(ans == 1)
            {
                buyTicket();
            }
            else if (ans == 2)
            {
                printSummary();
            }
        
        }
        while(ans != 3);
        
    }
    
    /** precondition:  none
     *  postcondition: prints a menu of ticket options and allows the 
     *     user to select one of the items in the menu. It purchases 
     *     a ticket according to ticket type selected.
     */
    public void buyTicket()
    {       
        out.println("===================\n" +
                    "     Buy Ticket\n" +
                    "===================\n" +
                    "1. Gold Pass\n" +
                    "2. Silver Pass\n" +
                    "3. Bronze Pass\n" +
                    "4. No Pass\n" +
                    "\n" +
                    "Selection -->");
        out.println();
        
        int ticket = scan.nextInt();
        dance.buyTicket(ticket);
    }
    
    /** precondition:  none
     *  postcondition: prints a summary report that includes the
     *     current number of students attending the dance and the 
     *     current amount of money made from ticket sales.
     */   
    public void printSummary()
    {
        out.println("===========================\n" +
                    "        Summary Report\n" +
                    "===========================\n" +
                    "Total Attendance = " + dance.getAttendance());
        out.println("Ticket Sales     = $" + dance.getTicketSales());
        out.println();
    }
	
    public static void main(String[] args)
    {
        StudentCouncil app = new StudentCouncil();
        app.mainMenu();
    }
}
