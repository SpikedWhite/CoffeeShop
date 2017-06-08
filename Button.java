import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    int fontSize;
    String text;
    String firstImage;
    String secondImage;
    GreenfootImage text1;
    GreenfootImage text2;
    
    /**
     * Act - do whatever the button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        handleMouseClicks();
    }    
    
    public Button(int fs, String f, String s, String t)
    {
        text = t;
        fontSize = fs;
        firstImage = f;
        secondImage = s;
        text1 = new GreenfootImage(t, fontSize, Color.WHITE, new Color(0, 0, 0, 0));
        text2 = new GreenfootImage(t, fontSize, Color.BLACK, new Color(0, 0, 0, 0));
        setImage(firstImage);
        getImage().drawImage(text1, (getImage().getWidth() - text1.getWidth())/2, (getImage().getHeight() - text1.getHeight())/2);
    }
    
    public Button(String f, String s)
    {
        firstImage = f;
        secondImage = s;
        setImage(firstImage);
    }
    
    /**
     * handleMouseClicks checks if the mouse has been clicked or pressed on the button
     * @param there are no parameters
     * @return nothing is returned
     */
    private void handleMouseClicks()
    {
        if(Greenfoot.mousePressed(this))
        {
            setImage(secondImage);
            getImage().drawImage(text2, (getImage().getWidth() - text2.getWidth())/2, (getImage().getHeight() - text2.getHeight())/2);
        }
        else if(Greenfoot.mouseClicked(this))
        {
            setImage(firstImage);
            getImage().drawImage(text1, (getImage().getWidth() - text1.getWidth())/2, (getImage().getHeight() - text1.getHeight())/2);
            clickedAction();
        }
    }
    
    /**
     * clickedAction ignores the case of the text 
     * @param there are no parameters
     * @return nothing is returned
     */
    private void clickedAction()
    {
        UIMainWorld guiWorld = (UIMainWorld)getWorld();
        if(text.equalsIgnoreCase("Add Timbit:"))
        {
            guiWorld.addItem(new Timbit());
        }
        
        if(text.equalsIgnoreCase("Add Doughnut:"))
        {
            guiWorld.addItem(new Doughnut());
        }
        
        if(text.equalsIgnoreCase("Add Coffee:"))
        {
            guiWorld.addItem(new Coffee());
        }
    }
}
