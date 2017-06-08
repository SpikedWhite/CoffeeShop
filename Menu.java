import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends Actor
{
    TextBox titleBar;
    TextBox menuItems;
    MenuCommands menuCommands;
    int fontSize = 24;
    boolean visible = false;
    Color mainFG;
    Color mainBG;
    Color secondFG;
    Color secondBG;
    int titleHeight;
    int menuHeight;
    
    public Menu()
    {
        this("not initialized", "none", 24, Color.BLACK, Color.lightGray, Color.BLACK, Color.WHITE, null);
    }
    
    public Menu(String tb, String items, int fs, Color fgMain, Color bgMain, Color fgSecond, Color bgSecond, MenuCommands mc)
    {
        fontSize = fs;
        mainFG = fgMain;
        mainBG = bgMain;
        secondFG = fgSecond;
        secondBG = bgSecond;
        menuCommands = mc;
        titleBar = new TextBox(tb, fontSize, true, mainFG, mainBG);
        menuItems = new TextBox(items, fontSize, true, secondFG, secondBG);
    }
    
    /**
     * addedToWorld adds a title bar object into the world at X and Y
     * @param World w
     * @return nothing is returned
     */
    public void addedToWorld(World w)
    {
        w.addObject(titleBar, getX(), getY());
        titleHeight = titleBar.getImage().getHeight();
        menuHeight = menuItems.getImage().getHeight();
    }
    
    /**
     * Act - do whatever the Menu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        handleMouse();
    }    
    
    /**
     * handleMouse when the mouse clicks on titleBar it shows menuItems
     * @param there are no parameters
     * @return nothing is returned
     */
    public void handleMouse()
    {
        MouseInfo mi;
        int menuIndex;
        if(Greenfoot.mouseClicked(titleBar))
        {
            if(visible == false)
            {
                getWorld().addObject(menuItems, getX(), getY() + (titleHeight + menuHeight)/2);
            }
            else if(visible == true)
            {
                getWorld().removeObject(menuItems);
            }
            visible = !visible;
        }
        
        if(Greenfoot.mouseClicked(menuItems))
        {
            mi = Greenfoot.getMouseInfo();
            menuIndex = ( (mi.getY() - menuItems.getY() + menuHeight / 2) - 1 ) / fontSize;
            getWorld().removeObject(menuItems);
            menuCommands.execute(menuIndex, getWorld());
            visible = !visible;
            
        }
    }
}
