import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoalA4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoalA4 extends World
{

    /**
     * Constructor for objects of class SoalA4.
     * 
     */
    public SoalA4()
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
        A4_A a4_A = new A4_A();
        addObject(a4_A,240,270);
        A4_B a4_B = new A4_B();
        addObject(a4_B,400,270);
        A4_C a4_C = new A4_C();
        addObject(a4_C,560,270);
        
        
        Chara elephant = new Chara("zebra.gif");
        addObject(elephant, 710, 460);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);
    }
}
