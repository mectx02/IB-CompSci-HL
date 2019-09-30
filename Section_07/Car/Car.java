package HL_1.Section_07.Car;

public class Car
{
    // Constants
    public final double capacity = 22;   // number of gallons the gas
                                         // tank can hold when full
    // Instance Variables
    
    double startMiles;
    double endMiles;
    double gallons;

    
    // Constructors

    public Car(double sM, double eM, double g) {
        startMiles = sM;
        endMiles = eM;
        gallons = g;
    }
    
    // Methods
    
    /** precondition:  gallons > 0
     *  postcondition: calculates and returns the cars MPG (miles per gallon)
     *     for the current odometer readings.
     *  @return the car's MPG
     */
    public double calculateMPG()
    {
        double MPG = (endMiles - startMiles) / gallons;  
        return MPG;
    }
    
    /** precondition:  none
     *  postcondition: calculates and returns the number of miles the car
     *     can travel before its gas tank is empty.
     *  @return number of miles car can travel before tank is empty
     */
    public double milesToEmpty()
    {
        double MPG = calculateMPG();
        return (capacity - gallons) * MPG;
    }
}
