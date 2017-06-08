import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.util.List;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UIMainWorld extends World
{
    boolean onSales;
    private SalesItem[] salesItem;
    int numItemsAdded;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public UIMainWorld()
    {   
        super(600, 400, 1); 
        startScreen();
    }
    
    /**
     * startScreen creates and places the menu used to start new sales
     * @param ther are no parameters
     * @return nothing is returned
     */
    public void startScreen()
    {
        onSales = false;
        
        numItemsAdded = 0;  
        Menu guiMenu = new Menu("File", "NewSale\nClose\nExit", 24, Color.BLACK, Color.WHITE, Color.BLACK,Color.WHITE, new FileCommands());
        clearScreen();
        addObject(guiMenu, 200, 50);
    }
    
    /**
     * salesScreen displays the buttons used to add items to the sale
     * @param there are no parameters
     * @return nothing is returned
     */
    public void salesScreen()
    {
        onSales = true;
        salesItem = new SalesItem[50];
        Button timbitAdd = new Button(24, "button-blue.png", "button-green.png", "Add timbit:");
        Button doughnutAdd = new Button(24, "button-blue.png", "button-green.png", "Add doughnut:");
        Button coffeeAdd = new Button(24, "button-blue.png", "button-green.png", "Add coffee:");
        
        addObject(timbitAdd, 400, 100);
        addObject(doughnutAdd, 400, 200);
        addObject(coffeeAdd, 400, 300);
    }
    
    /**
     * thankYou calls clearScreen method then displays a thank you message
     * @param ther are no parameters
     * @return nothing is returned
     */
    public void thankYou()
    {
        onSales = false;
        clearScreen();
        showText("Thank you!", getHeight()/2, getWidth()/2);
        Greenfoot.stop();
    }
    
    /**
     * Act - do whatever the Menu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(onSales == true)
        {
            calculateSale();
        }
    }
    
    /**
     * calculateSale takes the amount and value of all sales items and calulates the total
     * @param ther are no parameters
     * @return nothing is returned
     */
    public void calculateSale()
    {
        double total = 0.00;
        int numTimbits = 0;
        int numDoughnuts = 0;
        int smallCoffee = 0;
        int mediumCoffee = 0;
        int largeCoffee = 0;
        String order;
        
        for(int i = 0; salesItem[i] != null && i < salesItem.length; i++)
        {
            if(salesItem[i] instanceof Timbit)  
            {
                numTimbits = numTimbits + salesItem[i].getNumOfItems();
            }
            else if(salesItem[i] instanceof Doughnut)
            {
                numDoughnuts = numDoughnuts + salesItem[i].getNumOfItems();
            }
            else if(salesItem[i] instanceof Coffee)
            {
                if(salesItem[i].getNumOfItems()==1)
                {
                    smallCoffee ++;
                }
                else if(salesItem[i].getNumOfItems()==2)
                {
                    mediumCoffee ++;
                }
                else
                {
                    largeCoffee ++;
                }
            }
            
            total += salesItem[i].getFinalPrice();
        }
        
        order = "Timbits: " + numTimbits + "\nDoughnuts: " + numDoughnuts + "\nSmall Coffees: " + smallCoffee + "\nMedium Coffees: " + mediumCoffee + "\nLarge Coffees: " + largeCoffee ; 
        showText(order + String.format("\nTotal Price: $%5.2f", total), 150, 175);
    }
    
    /**
     * addItem adds the entered amount to the correct sales item
     * @param salesItem access the salesItem array
     * @return nothing is returned
     */
    public void addItem(SalesItem salesItem)
    {
        this.salesItem[numItemsAdded] = salesItem;
        numItemsAdded = numItemsAdded + 1;
    }
    
    /**
     * clearScreen clears the screen by removing the list object
     * @param there are no parameters
     * @return nothing is returned
     */
    public void clearScreen()
    {
        showText("", 150, 175);
        List objects = getObjects(null);
        if(objects != null)
        {
            removeObjects(objects);
        }
    }
    
}
