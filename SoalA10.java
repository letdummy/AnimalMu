import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoalA10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoalA10 extends World
{

    /**
     * Constructor for objects of class SoalA10.
     * 
     */
    public SoalA10()
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
        A10_A a10_A = new A10_A();
        addObject(a10_A,240,270);
        A10_B a10_B = new A10_B();
        addObject(a10_B,400,270);
        A10_C a10_C = new A10_C();
        addObject(a10_C,560,270);
        
        
        Chara elephant = new Chara("snail.gif");
        addObject(elephant, 650, 400);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);
    }
}
