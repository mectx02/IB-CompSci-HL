package HL_1.Section_08.AP_Free_Response.StudentRecord;

public class StudentRecord
{ 
     private int[] scores; // contains scores.length values 
                           // scores.length > 1 
             
     // constructor          
     public StudentRecord(int[] s)
     {
     	scores = s;
     }
     
     // returns the average (arithmetic mean) of the values in scores 
     // whose subscripts are between first and last, inclusive 
     // precondition: 0 <= first <= last < scores.length 
     private double average(int first, int last) 
     { 
         double avg = 0;
         
         for (int i = first; i < scores.length; i++)
             avg = avg + scores[i];
         
         avg = avg / (last);
         
         return avg;         
     }
     
     // returns true if each successive value in scores is greater 
     // than or equal to the previous value; 
     // otherwise, returns false 
     private boolean hasImproved() 
     { 
         for (int i = 0; i < scores.length - 1; i++) {
             
             if (scores[i] > scores[i + 1])
                 return false;
             
         }
         
         return true;
     } 
     
     
     // if the values in scores have improved, returns the average 
     // of the elements in scores with indexes greater than or equal 
     // to scores.length/2; 
     // otherwise, returns the average of all of the values in scores 
     public double finalAverage() 
     { 
         if (hasImproved()) {
             /*
             int avg = 0;
             for (int i = 0; i < scores.length  - 1; i++)
                 avg = avg + scores[i];
             
             return avg / (scores.length / 2); 
         } */
            return average((scores.length / 2), scores.length); }
         
         else
            return average(0, scores.length);
         
     } 
} 