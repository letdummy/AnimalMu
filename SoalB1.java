import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoalB1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoalB1 extends World
{
    /**
     * Constructor for objects of class SoalB1.
     * 
     */
    public SoalB1()
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
        B1_A b1_A = new B1_A();
        addObject(b1_A,240,270);
        B1_B b1_B = new B1_B();
        addObject(b1_B,400,270);
        B1_C b1_C = new B1_C();
        addObject(b1_C,560,270);
        
        Chara cat = new Chara("whale.gif");
        addObject(cat, 700, 460);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);
    }
}
