import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CaraBermain1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaraBermain1 extends World
{

    /**
     * Constructor for objects of class CaraBermain1.
     * 
     */
    public CaraBermain1()
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
        Selanjutnya selanjutnya = new Selanjutnya();
        addObject(selanjutnya,649,428);
    
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);
    }
}
