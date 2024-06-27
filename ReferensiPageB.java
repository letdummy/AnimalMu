import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReferensiPageB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReferensiPageB extends World
{

    /**
     * Constructor for objects of class ReferensiPageB.
     * 
     */
    public ReferensiPageB()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        prepare();
    }
    
    private void prepare(){
        HomeBtn homeBtn = new HomeBtn();
        addObject(homeBtn,640,430);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);
    }
}
