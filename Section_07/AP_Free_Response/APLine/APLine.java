package HL_1.Section_07.AP_Free_Response.APLine;

public class APLine {
    
    int Axvar;
    int Byvar;
    int constant;
    int xCoordinate;
    int yCoordinate;
    
    public APLine(int Ax, int By, int c) {
        
        Axvar = Ax;
        Byvar = By;
        constant = c;
        
    }
    
    public double getSlope() {
        
        double slope;
        
        slope = ((double) Axvar / Byvar);
        
        return slope;
        
    }
    
    public boolean isOnLine(int xC, int yC) {
        
        xCoordinate = xC;
        yCoordinate = yC;
        
        if ( (Axvar * xC) + (Byvar * yCoordinate) + constant == 0)
            return true;
        
        return false;
    }
    
}