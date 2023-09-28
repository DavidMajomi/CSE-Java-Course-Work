
/**
 * Write a description of class Heater here.
 *
 * @author (David Majomi)
 * @version (a version number or a date)
 */
public class Heater
{
    // instance variables - replace the example below with your own
    private double temperature;
    private double increment;
    private double max;
    private double min;

    /**
     * Constructor for objects of class Heater
     */
    public Heater(double maxPossibleTemperature, double minPossibleTemperature)
    {
        // initialise instance variables
        increment = 5.0;
        temperature = 15.0;
        max = maxPossibleTemperature;
        min = minPossibleTemperature;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void warmer ()
    {
        if (temperature < max)
        {
            if ((temperature + increment) > max)
            {
                temperature = max;
            }
            else
            {
                temperature += increment;    
            }
             
        }
        
        
    }
    
    
    public void cooler ()
    {
        if ((temperature - increment) < min)
        {
            temperature = min;    
        }
        else
        {
            temperature -= increment;
        }
        
    }
    
    
    public void setIncrement(double incrementValue)
    {
        if (incrementValue >= 0)
        {
            increment = incrementValue;    
        }
        else
        {
            System.out.println("The increment value cannot be negative");
        }
        
        
    }
        
    
    public double getTemperature ()
    {
        return temperature;
    }
}

