import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ATutor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ATutor extends Actor
{
    /**
     * Act - do whatever the ATutor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        GifImage gif = new GifImage("audio.gif");
        
    public ATutor(){
        int scalePercent = 50;
        for (GreenfootImage image : gif.getImages())
        {
            int wide = image.getWidth()*scalePercent/100;
            int high = image.getHeight()*scalePercent/100;
            image.scale(wide, high);
        }
    }
    
    public void act()
    {
        // Add your action code here.
        setImage(gif.getCurrentImage());
    }
}
