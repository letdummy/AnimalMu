import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoalA6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoalA6 extends World
{

    /**
     * Constructor for objects of class SoalA6.
     * 
     */
    public SoalA6()
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
        A6_A a6_A = new A6_A();
        addObject(a6_A,240,270);
        A6_B a6_B = new A6_B();
        addObject(a6_B,400,270);
        A6_C a6_C = new A6_C();
        addObject(a6_C,560,270);
        
        Chara elephant = new Chara("fish.gif");
        addObject(elephant, 680, 400);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);
    }
}
