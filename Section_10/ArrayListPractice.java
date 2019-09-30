package HL_1.Section_10;

import java.util.*;      
import static java.lang.System.*;

public class ArrayListPractice
{
    static Scanner keyboard = new Scanner(in);
    
    public static void main (String[] args)
    {
       //Print Method 1
       System.out.println("Method 1");
       System.out.println("--------");
       System.out.println();
       Method1();
       
       //Print Method 2
       System.out.println();
       System.out.println("Method 2");
       System.out.println("--------");
       System.out.println();
       Method2();       
    }
    
    public static void Method1()
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");
        list.add("60");
        list.add("70");
        list.add("80");
        list.add("90");
        list.add("100");
        
        //loop 1
        for (int i = 0; i < 10; i++) {
            
            out.println(list.get(i));
            
        }
        out.println();
        
        //loop 2
        for(String i : list) {
            
            out.println(i);
            
        }
    }
    
    public static void Method2()
    {
        Scanner keyboard = new Scanner(in);
        
        //Setup scanning system
        
        ArrayList<String> list = new ArrayList<>();
        String input = "";
        
        out.println("Enter words, then press the [ENTER] key. ");
        out.println("When done, type 'EXIT' to start the process. \n");
        
        while (!input.equalsIgnoreCase("exit")) {
            
            out.print("Enter a word: ");
            input = keyboard.next();
            
            if (!input.equalsIgnoreCase("exit")) {
                
                list.add(input);
                
            }
            
        }
        
        keyboard.close();
        
        //Loop 1
        for (String i : list) {
            
            out.println(i);
            
        }
        out.println();
        out.println();
        
        //Loop 2
        for (int i = 0; i < list.size(); i++) {
            
            out.println(list.get(i));
            
        }
    }
}
