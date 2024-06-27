import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoalAEnd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoalAEnd extends World
{

    /**
     * Constructor for objects of class SoalAEnd.
     * 
     */
    public SoalAEnd()
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
        CheckScore checkScore = new CheckScore();
        addObject(checkScore,394,293);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);
    }
}
