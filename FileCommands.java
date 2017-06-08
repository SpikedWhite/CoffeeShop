import greenfoot.*;

/**
 * Write a description of class FileCommands here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FileCommands implements MenuCommands  
{
    /**
     * execute uses idx to tell the system what text to display 
     * @param int idx is an integer to represent text
     * @param world w is a reference to the world
     * @return nothing is returned
     */
    public void execute(int idx, World w)
    {
        UIMainWorld guiWorld = (UIMainWorld)w;
        if(idx == 0)
        {
            guiWorld.salesScreen();
        }
        else if(idx == 1)
        {
            guiWorld.startScreen();
        }
        else if(idx == 2)
        {
            guiWorld.thankYou();
        }
        
    }
}
