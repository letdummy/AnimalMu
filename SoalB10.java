import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoalB10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoalB10 extends World
{

    /**
     * Constructor for objects of class SoalB10.
     * 
     */
    public SoalB10()
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
        B10_A b10_A = new B10_A();
        addObject(b10_A,240,270);
        B10_B b10_B = new B10_B();
        addObject(b10_B,400,270);
        B10_C b10_C = new B10_C();
        addObject(b10_C,560,270);
        
        Chara elephant = new Chara("chicken.gif");
        addObject(elephant, 650, 400);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);
    }
}
