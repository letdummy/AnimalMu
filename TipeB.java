import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TipeB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TipeB extends Actor
{
    /**
     * Act - do whatever the TipeB wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this)){
            LandingPage.pop();
            TipeSoal.type = "B";
            Greenfoot.setWorld(new LandingTipeB());
        } 
    }
}
