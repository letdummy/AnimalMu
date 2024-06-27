import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoalB4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoalB4 extends World
{

    /**
     * Constructor for objects of class SoalB4.
     * 
     */
    public SoalB4()
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
        B4_A b4_A = new B4_A();
        addObject(b4_A,240,270);
        B4_B b4_B = new B4_B();
        addObject(b4_B,400,270);
        B4_C b4_C = new B4_C();
        addObject(b4_C,560,270);
        
        Chara cat = new Chara("giraffe.gif");
        addObject(cat, 690, 390);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);

    }
}
