import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoalB5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoalB5 extends World
{

    /**
     * Constructor for objects of class SoalB5.
     * 
     */
    public SoalB5()
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
        B5_A b5_A = new B5_A();
        addObject(b5_A,240,270);
        B5_B b5_B = new B5_B();
        addObject(b5_B,400,270);
        B5_C b5_C = new B5_C();
        addObject(b5_C,560,270);
        
        Chara cat = new Chara("monkey.gif");
        addObject(cat, 690, 410);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);

    }
}
