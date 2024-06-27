import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoalA2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoalA2 extends World
{

    /**
     * Constructor for objects of class SoalA2.
     * 
     */
    public SoalA2()
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
        A2_A a2_A = new A2_A();
        addObject(a2_A,240,270);
        A2_B a2_B = new A2_B();
        addObject(a2_B,400,270);
        A2_C a2_C = new A2_C();
        addObject(a2_C,560,270);
    
        
        Chara elephant = new Chara("elephants.gif");
        addObject(elephant, 740, 440);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);
    }
}
