import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoalA5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoalA5 extends World
{

    /**
     * Constructor for objects of class SoalA5.
     * 
     */
    public SoalA5()
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
        A5_A a5_A = new A5_A();
        addObject(a5_A,240,270);
        A5_B a5_B = new A5_B();
        addObject(a5_B,400,270);
        A5_C a5_C = new A5_C();
        addObject(a5_C,560,270);
        
        Chara elephant = new Chara("bird.gif");
        addObject(elephant, 680, 400);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);
    }
}
