import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MulaiBtn3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MulaiBtn3 extends Actor
{
    /**
     * Act - do whatever the MulaiBtn3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this)){
            LandingPage.pop();
            Greenfoot.setWorld(new SoalB1());
        } 
    }
}
