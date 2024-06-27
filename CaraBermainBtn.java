import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CaraBermainBtn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaraBermainBtn extends Actor
{
    /**
     * Act - do whatever the CaraBermainBtn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this)){
            LandingPage.pop();
            Greenfoot.setWorld(new CaraBermain1());
        }
    }
}
