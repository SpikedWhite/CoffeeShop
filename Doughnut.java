import javax.swing.*; 
/**
 * Write a description of class Doughnut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Doughnut extends SalesItem 
{
    
    /**
     * Constructor for objects of class Doughnut
     */
    public Doughnut()
    {
        final double DOUGHNUT_PRICE = 0.99;
        final double BOX_CAPACITY = 6;
        final double BOX_PRICE = 5.00;
        int numBoxes;
        int numDoughnut = Integer.parseInt(JOptionPane.showInputDialog( null, "Enter the number of Doughnuts:"));
        
        setNumber(numDoughnut);
        
        numBoxes = numDoughnut / 6;
        numDoughnut = numDoughnut % 6;
        
        setPrice(numDoughnut * 0.99 +  numBoxes * 5.00);
    }
}
