import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LandingTipeB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LandingTipeB extends World
{
    /**
     * Constructor for objects of class LandingTipeB.
     * 
     */
    public static int scoreA = 0;
    
    public LandingTipeB()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MulaiBtn3 mulaiBtn3 = new MulaiBtn3();
        addObject(mulaiBtn3,399,295);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);
    }
}
