/**
 * Write a description of class SalesItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SalesItem  
{
    // instance variables - replace the example below with your own
    private double salesPrice;
    private int numOfItems;
    
    /**
     * Constructor for objects of class SalesItem
     */
    public SalesItem()
    {
        salesPrice = 0;
        numOfItems = 0;
    }
    
    /**
     * SalesItem salesPrice ends up qualing salesPrice
     * @param int sp represents salesPrice
     * @return nothing is returned
     */
    public SalesItem(int sp)
    {
        salesPrice = salesPrice;
        numOfItems = numOfItems;
    }
    
    /**
     * getNumOfItems gets the number of items to be in the sale
     * @param there are no parameters
     * @return numOfItems
     */
    public int getNumOfItems()
    {
        return (numOfItems);
    }
    
    /**
     * getFinalPrice represents the final price of the sale
     * @param there are no parameters
     * @return salesPrice multiplied by taxes
     */
    public double getFinalPrice()
    {
        return (salesPrice * 1.13);
    }
    
    /**
     * setPrice sets the price for the sale item
     * @param sPrice represents salesPrice
     * @return nothing is returned
     */
    public void setPrice(double sPrice)
    {
        salesPrice = sPrice;
    }
    
    /**
     * setNumber sets the number of items
     * @param numItem represents numOfItems
     * @return nothing is returned
     */
    public void setNumber(int numItem)
    {
        numOfItems = numItem;
    }

}
