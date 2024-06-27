import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoalB6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoalB6 extends World
{

    /**
     * Constructor for objects of class SoalB6.
     * 
     */
    public SoalB6()
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
        B6_A b6_A = new B6_A();
        addObject(b6_A,240,270);
        B6_B b6_B = new B6_B();
        addObject(b6_B,400,270);
        B6_C b6_C = new B6_C();
        addObject(b6_C,560,270);
        
        Chara cat = new Chara("polar.gif");
        addObject(cat, 650, 410);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);

    }
}
