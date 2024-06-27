import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OkeMengerti here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OkeMengerti extends Actor
{
    /**
     * Act - do whatever the OkeMengerti wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this)){
            LandingPage.pop();
            Greenfoot.setWorld(new LandingPage());
        }
    }
}
