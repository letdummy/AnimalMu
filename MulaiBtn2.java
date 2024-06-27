import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MulaiBtn2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MulaiBtn2 extends Actor
{
    /**
     * Act - do whatever the MulaiBtn2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this)){
            LandingPage.pop();
            Greenfoot.setWorld(new SoalA1());
        } 
    }
}
