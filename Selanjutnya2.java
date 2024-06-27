import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Selanjutnya2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Selanjutnya2 extends Actor
{
    /**
     * Act - do whatever the Selanjutnya2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this)){
            LandingPage.pop();
            Greenfoot.setWorld(new CaraBermain3());
        }
    }
}
