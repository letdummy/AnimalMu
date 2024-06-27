import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoalB2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoalB2 extends World
{
    static Counter counter = new Counter();
    /**
     * Constructor for objects of class SoalB2.
     * 
     */
    public SoalB2(int counter)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        this.counter.setValue(counter);
        prepare();
    }
    public SoalB2()
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
        B2_A b2_A = new B2_A();
        addObject(b2_A,240,270);
        B2_B b2_B = new B2_B();
        addObject(b2_B,400,270);
        B2_C b2_C = new B2_C();
        addObject(b2_C,560,270);
        
        Chara cat = new Chara("beaver.gif");
        addObject(cat, 690, 410);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);
    }
}
