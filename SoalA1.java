import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoalA1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoalA1 extends World
{

    /**
     * Constructor for objects of class SoalA1.
     * 
     */
    public SoalA1()
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

        A1_A a1_A = new A1_A();
        addObject(a1_A,240,270);
        A1_B a1_B = new A1_B();
        addObject(a1_B,400,270);
        A1_C a1_C = new A1_C();
        addObject(a1_C,560,270);
        
        Chara cat = new Chara("cat.gif");
        addObject(cat, 720, 440);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);
    }
}
