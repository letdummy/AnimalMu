import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CheckScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CheckScore extends Actor
{
    /**
     * Act - do whatever the CheckScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this)){
            LandingPage.pop();
            Greenfoot.setWorld(new LandingScore());
        }
    }
}
