import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoalA9 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoalA9 extends World
{

    /**
     * Constructor for objects of class SoalA9.
     * 
     */
    public SoalA9()
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
        A9_A a9_A = new A9_A();
        addObject(a9_A,240,270);
        A9_B a9_B = new A9_B();
        addObject(a9_B,400,270);
        A9_C a9_C = new A9_C();
        addObject(a9_C,560,270);
        
        Chara elephant = new Chara("kangaroo.gif");
        addObject(elephant, 680, 400);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);
    }
}
