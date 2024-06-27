import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoalB3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoalB3 extends World
{

    /**
     * Constructor for objects of class SoalB3.
     * 
     */
    public SoalB3()
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
        B3_A b3_A = new B3_A();
        addObject(b3_A,240,270);
        B3_B b3_B = new B3_B();
        addObject(b3_B,400,270);
        B3_C b3_C = new B3_C();
        addObject(b3_C,560,270);
        
        Chara cat = new Chara("chameleon.gif");
        addObject(cat, 690, 410);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);

    }
}
