
/**
 * Write a description of class HeaterApplication here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


import java.util.Scanner;
import javax.swing.JOptionPane;

public class HeaterApplication
{
    public static void main (String[] args){
        int askMin, askMax, checkMin, checkMax;
        
        //Heater heater1;
        //Heater heater2;
        
        Scanner kb = new Scanner (System.in);
        
        System.out.println("You are creating parameters for two heater systems");
        System.out.println("We will start with the first heater system.");
        System.out.println("Please enter the minimum temperature, between 0 and 100: ");
        checkMin = kb.nextInt();
        if (checkMin > 0 && checkMin < 100){
            askMin = checkMin;
        } else {
            throw new IllegalArgumentException("Please Input an Integer between 0 and 100");
        }
        kb.nextLine();
        System.out.println("------");
        
        System.out.println("Please enter the maximum temperature, between 0 and 100, ");
        System.out.println("but higher than the minimum temperature.");
        
        checkMax = kb.nextInt();
        if (checkMax > 0 && checkMax < 100 && checkMax > checkMin){
            askMax = checkMax;
        } else {
            throw new IllegalArgumentException("Please Input an Integer between 0 and 100, " 
                                               + " and greater then minimum temperature");
        }
        kb.nextLine();
        
        System.out.println("Good. Setting limits to heater system now.");
        
        int setMin = askMin;
        int setMax = askMax;
        //heater1 = new Heater (setMin, setMax);
        Heater heater1 = new Heater(setMin, setMax);
        
        System.out.println("Your heater mimimum temperature is " + setMin);
        System.out.println("Your heater maximum temperature is " + setMax);
        System.out.println("your heater temperature is currently at " + heater1.getTemperature());
        heater1.cooler();
        System.out.println("Your heater was set to cooler. It temp is now " + heater1.getTemperature());
        
        String inputMin = JOptionPane.showInputDialog("Enter the minimum temperature for the second "
                                                + "heater system");
        int secondMin = Integer.parseInt(inputMin);
                       
        String inputMax = JOptionPane.showInputDialog("Enter the maximum temperature fo the second "
                                                      + "heater system");
        int secondMax = Integer.parseInt(inputMax);
        
        Heater heater2 = new Heater (secondMin, secondMax);
        
        JOptionPane.showMessageDialog(null, "The heater temperature is: " + heater2.getTemperature());
        heater2.warmer();
        JOptionPane.showMessageDialog(null, "The heater temperature is now: " + heater2.getTemperature());
        
    }
    
}
