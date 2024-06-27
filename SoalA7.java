import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoalA7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoalA7 extends World
{

    /**
     * Constructor for objects of class SoalA7.
     * 
     */
    public SoalA7()
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
        A7_A a7_A = new A7_A();
        addObject(a7_A,240,270);
        A7_B a7_B = new A7_B();
        addObject(a7_B,400,270);
        A7_C a7_C = new A7_C();
        addObject(a7_C,560,270);
        
        
        Chara elephant = new Chara("duck.gif");
        addObject(elephant, 700, 420);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);
    }
}
