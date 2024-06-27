import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TipeA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TipeA extends Actor
{
    /**
     * Act - do whatever the TipeA wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this)){
            LandingPage.pop();
            TipeSoal.type = "A";
            Greenfoot.setWorld(new LandingTipeA());
        } 
    }
}
