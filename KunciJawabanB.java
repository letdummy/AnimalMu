import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KunciJawabanB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KunciJawabanB extends World
{

    /**
     * Constructor for objects of class KunciJawabanB.
     * 
     */
    public KunciJawabanB()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        Referensi referensi = new Referensi();
        addObject(referensi,640,430);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);
    }
}
