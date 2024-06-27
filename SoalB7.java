import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoalB7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoalB7 extends World
{

    /**
     * Constructor for objects of class SoalB7.
     * 
     */
    public SoalB7()
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
        B7_A b7_A = new B7_A();
        addObject(b7_A,240,270);
        B7_B b7_B = new B7_B();
        addObject(b7_B,400,270);
        B7_C b7_C = new B7_C();
        addObject(b7_C,560,270);
        
        Chara cat = new Chara("spider.gif");
        addObject(cat, 660, 380);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);

    }
}
