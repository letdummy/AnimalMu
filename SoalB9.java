import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoalB9 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoalB9 extends World
{

    /**
     * Constructor for objects of class SoalB9.
     * 
     */
    public SoalB9()
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
        B9_A b9_A = new B9_A();
        addObject(b9_A,240,270);
        B9_B b9_B = new B9_B();
        addObject(b9_B,400,270);
        B9_C b9_C = new B9_C();
        addObject(b9_C,560,270);
        
        Chara cat = new Chara("rabbit.gif");
        addObject(cat, 690, 410);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);

        
    }
}
