import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LandingTipeA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LandingTipeA extends World
{
    /**
     * Constructor for objects of class LandingTipeA.
     * 
     */
    public LandingTipeA()
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
        MulaiBtn2 mulaiBtn2 = new MulaiBtn2();
        addObject(mulaiBtn2,399,295);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);
    }
}
