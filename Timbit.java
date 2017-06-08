import javax.swing.*;
/**
 * Write a description of class Timbit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timbit extends SalesItem 
{
    
    /**
     * Constructor for objects of class Timbit
     */
    public Timbit()
    {
        final double TIMBIT_PRICE = 0.30;
        final double BOX_CAPACITY = 12;
        final double BOX_PRICE = 3.00;
        int numBoxes;
        int numTimbits = Integer.parseInt(JOptionPane.showInputDialog( null, "Enter the number of Timbits:"));
        
        setNumber(numTimbits);
        
        numBoxes = numTimbits / 12;
        numTimbits = numTimbits % 12;
        
        setPrice(numTimbits * 0.30 +  numBoxes * 3.00);
    }
}
