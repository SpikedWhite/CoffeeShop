import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Label here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Label extends Actor
{
    private String value;
    private int fontSize;
    private Color lineColor = Color.BLACK;
    private Color fillColor = Color.WHITE;
    private final Color TRANSPARENT = new Color(0, 0, 0, 0);
    
    /**
     * Act - do whatever the Label wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public Label()
    {
        
    }
    
    public Label( String value, int fontSize)
    {
        this.value = value;
        this.fontSize = fontSize;
        updateImage();
    }
    
    public Label(int value, int fontSize)
    {
        this(Integer.toString(value), fontSize);
    }
    
    /**
     * setValue sets value to string v
     * @param String v is 
     * @return nothing is returned
     */
    public void setValue(String v)
    {
        value = v;
        updateImage();
    }
    
    /**
     * setValue sets integer value to string value 
     * @param int v
     * @return nothing is returned
     */
    public void setValue(int v)
    {
        value = Integer.toString(v);
        updateImage();
    }
    
    /**
     * setLineColor sets LineColor to Black
     * @param Color Line 
     * @return nothing is returned
     */
    public void setLineColor(Color line)
    {
        lineColor = line;
        updateImage();
    }
    
    /**
     * setFillColor sets FillColor to White
     * @param Color fill 
     * @return nothing is returned
     */
    public void setFillColor(Color fill)
    {
        fillColor = fill;
        updateImage();
    }
    
    /**
     * updateImage sets image to a new greenfootImage
     * @param there are no parameters
     * @return nothing is returned
     */
    public void updateImage()
    {
        setImage( new GreenfootImage(value, fontSize, fillColor, TRANSPARENT, lineColor) );
    }
}
