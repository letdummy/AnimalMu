import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoalA8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoalA8 extends World
{

    /**
     * Constructor for objects of class SoalA8.
     * 
     */
    public SoalA8()
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
        A8_A a8_A = new A8_A();
        addObject(a8_A,240,270);
        A8_B a8_B = new A8_B();
        addObject(a8_B,400,270);
        A8_C a8_C = new A8_C();
        addObject(a8_C,560,270);
        
        Chara elephant = new Chara("lion.gif");
        addObject(elephant, 680, 400);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);
    }
}
