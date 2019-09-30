package HL_1.Section_10.Diet;

import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class Diet {
    
    private ArrayList<Entry> diet; 
    
    int difference;
    int net;
    
    public Diet() {
    
        diet = new ArrayList<>();
        difference = 0;
        net = 0;
    
    }
    
    public void addEntry(Entry e) {
        
        diet.add(e);
        
    }
    
    public Entry getEntry(String s) {
        
        for(Entry a : diet) {
            
            if(s.equals(a.getDate())) {
                
                return a;
                
            }
            
        }
        return null;
    }
    
    public void viewList() {
        
        int previousWeight = 0;
        
        out.println("Date\t Weight \t Difference");
        out.println("========================================");
        for (Entry a : diet) {
            
            out.println(a);
            difference = a.getWeight() - previousWeight;
            out.printf("%-12s", difference);
            previousWeight = a.getWeight();
            net += difference;
            
        }
        
        out.println("----------------------------------------");
        out.println();
        out.println("Net Weight Loss/Gain: " + net);
        out.println("========================================");
    }
}
