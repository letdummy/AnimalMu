import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CaraBermain3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaraBermain3 extends World
{

    /**
     * Constructor for objects of class CaraBermain3.
     * 
     */
    public CaraBermain3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        prepare();
        
        
    }
    private void prepare()
    {
        OkeMengerti okeMengerti = new OkeMengerti();
        addObject(okeMengerti,649,440);
        
        ATutor tutor = new ATutor();
        addObject(tutor, 400, 235);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);
    }
}
