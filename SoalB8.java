import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoalB8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoalB8 extends World
{

    /**
     * Constructor for objects of class SoalB8.
     * 
     */
    public SoalB8()
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
        B8_A b8_A = new B8_A();
        addObject(b8_A,240,270);
        B8_B b8_B = new B8_B();
        addObject(b8_B,400,270);
        B8_C b8_C = new B8_C();
        addObject(b8_C,560,270);
        
        Chara cat = new Chara("pig.gif");
        addObject(cat, 680, 430);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);

    }
}
