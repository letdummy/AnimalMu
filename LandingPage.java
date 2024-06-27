import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LandingPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LandingPage extends World
{
    /**
     * Constructor for objects of class LandingPage.
     * 
     */
    public LandingPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        prepare();
        
        
    }
    
    public static GreenfootSound bgm = new GreenfootSound("bgm.wav");
    public static GreenfootSound pop = new GreenfootSound("pop.wav");
    
    public static String audio = "unmute";
 
    public static void startBgm()
    {
        bgm.playLoop();
    }
 
    public static void stopBgm()
    {
        bgm.stop();
    }
    
    public static void pop(){
        pop.play();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MulaiBtn mulaiBtn = new MulaiBtn();
        addObject(mulaiBtn,405,263);
        CaraBermainBtn caraBermainBtn = new CaraBermainBtn();
        addObject(caraBermainBtn,405,341);
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);
    }
}
