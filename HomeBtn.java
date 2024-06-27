import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HomeBtn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomeBtn extends Actor
{
    /**
     * Act - do whatever the HomeBtn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this)){
            LandingPage.pop();
            LandingScore.counter.setValue(0);
            Greenfoot.setWorld(new LandingPage());
        }
    }
}
