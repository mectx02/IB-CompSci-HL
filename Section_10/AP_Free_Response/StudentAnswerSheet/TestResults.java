package HL_1.Section_10.AP_Free_Response.StudentAnswerSheet;

import java.util.*;

public class TestResults
{
   private ArrayList<StudentAnswerSheet> sheets;
   
   // constructor
   public TestResults()
   {
   	  sheets = new ArrayList<StudentAnswerSheet>();
   }
   
   public void add(StudentAnswerSheet s)
   {
   	  sheets.add(s);
   }
   
   // Part (b)
   /** Precondition: sheets.size() > 0;
    *                all answer sheets in sheets have the same number of answers
    *  @param key the list of correct answers represented as strings of length one
    *         Precondition: key.size() is equal to the number of answers
    *                       in each of the answer sheets in sheets
    *  @return the name of the student with highest score
    */
   public String highestScoringStudent(ArrayList<String> key)
   {
       double highScore = 0;
       String highStudent = "";
       
       for (int i = 0; i < sheets.size(); i++) {
           
           double score = sheets.get(i).getScore(key);
           
           if (score > highScore) {
               
               highScore = score;
               highStudent = sheets.get(i).getName();
               
           }

       }
       
       return highStudent;
       
   }
   
   
   // There may be fields, constructors, and methods that are not shown.
  
}