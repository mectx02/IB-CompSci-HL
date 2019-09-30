package HL_1.Section_06;

import HL_1.Section_06.Utility.Utility;
import static java.lang.System.out;

public class UILCompSci {
    
    public static void main(String args[]) {
    
        String name = Utility.readString("Enter name: ");
        int correct = Utility.readInt("Questions correct: ");
        int incorrect = Utility.readInt("Questions incorrect: ");
        int skip = 40 - (correct + incorrect);
        correct = correct * 6;
        incorrect = incorrect * 2;
        int total = correct - incorrect;
        
        Utility.blankLines(10);
        
        out.println("Name of contestant     | " + name);
        out.println("Questions correct      | " + correct / 6);
        out.println("Questions incorrect    | " + incorrect / 2);
        out.println("Questions skipped      | " + skip);
        out.println("----------------------------");
        out.println("Total points received  | " + total);
        Utility.blankLines(1);
        
    }
    
}
