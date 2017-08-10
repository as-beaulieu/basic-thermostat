
/**
 * A heater program that can change the temperature by a increment, either set, or defaulted to 
 * 5 units. Checks to make sure that the temeperature does not fall outside the range of a set
 * minimum and maximum.
 * 
 * @author Andrew Beaulieu 
 * @version Oct.04.2016
 */


public class Heater
{
    // instance variables - replace the example below with your own
    private int temperature;
    private int minTemperature;
    private int maxTemperature;
    private int increment;

    /**
     * Constructor for objects of class Heater
     */
    public Heater(int setMin, int setMax){
        temperature = 15;
        increment = 5;
        
        if (setMax < setMin){
            throw new IllegalArgumentException("Min Value must be less than Max Value.");
        }
        minTemperature = setMin;
        maxTemperature = setMax;
    }

    /**
     * accessor Method getTemperature(). Prints the temperature if it is a positive number.
     * Else will set temperature to 5 and return the value.
     * 
     * @return     If temperature is greater than 0, than return the temperature. Else
     *              The temperature will be set to 5
     */
    public int getTemperature(){
        if (temperature > 0){
            System.out.println("Temp: " + temperature);
        } else {
            temperature = 5;
        }
        return temperature;
    }
    
    
    /**
     * Method setIncrement()
     * 
     * @param integer changeRate
     * 
     * Checks to make sure changeRate is a positive number, and sets the increment value
     * to it. If it is negative, increment is defaulted back to 5.
     */
    public int setIncrement(int changeRate){
        if (changeRate > 0){
            increment = changeRate;
        } else {
            increment = 5;
        }
        return increment;
    }
    
    /**
     * Method cooler()
     * 
     * Reduces the temperature by the value of the increment variable, so long as it does not
     * exceed the minimum temperature.
     */
    
    public int cooler(){
        int checkCooler;
        
        checkCooler = temperature - increment;
        
        if (checkCooler > minTemperature){
           temperature -= increment; 
        }
        return temperature;
    }
    
    
    /**
     * Method warmer()
     * 
     * Increases the temperature by the value of the increment variable, so long as it does not
     * exceed the maximum temperature
     */
    public int warmer(){
        int checkWarmer;
        
        checkWarmer = temperature + increment;
        
        if (checkWarmer < maxTemperature){
            temperature += increment;
        }
        return temperature;
    }
}
