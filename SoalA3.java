import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoalA3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoalA3 extends World
{

    /**
     * Constructor for objects of class SoalA3.
     * 
     */
    public SoalA3()
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
        A3_A a3_A = new A3_A();
        addObject(a3_A,240,270);
        A3_B a3_B = new A3_B();
        addObject(a3_B,400,270);
        A3_C a3_C = new A3_C();
        addObject(a3_C,560,270);
        
        Chara elephant = new Chara("dog.gif");
        addObject(elephant, 720, 430);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);
    }
}
