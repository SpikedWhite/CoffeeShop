import javax.swing.*; 
/**
 * Write a description of class Coffee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coffee extends SalesItem 
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Coffee
     */
    public Coffee()
    {
        final double SMALL_COFFEE = 1.33;
        final double MEDIUM_COFFEE = 1.59;
        final double LARGE_COFFEE = 1.86;
        String size = JOptionPane.showInputDialog(null, "Enter the size of coffee");
        
        if(size.equalsIgnoreCase("s"))
        {
            setNumber(1);
            setPrice(SMALL_COFFEE);
        }
        
        if(size.equalsIgnoreCase("m"))
        {
            setNumber(2);
            setPrice(MEDIUM_COFFEE);
        }
        
        if(size.equalsIgnoreCase("l"))
        {
            setNumber(3);
            setPrice(LARGE_COFFEE);
        }
    }
    
}
