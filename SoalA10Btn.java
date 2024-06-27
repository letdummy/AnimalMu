import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoalA10Btn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoalA10Btn extends Actor
{
    /**
     * Act - do whatever the SoalA10Btn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    protected void clicked(){
        if(Greenfoot.mousePressed(this)){
            LandingPage.pop();
            Greenfoot.setWorld(new SoalAEnd());
        }
    }
    protected void clickedAdd(){
        if(Greenfoot.mousePressed(this)){
            LandingScore.counter.add(1);
            LandingPage.pop();
            Greenfoot.setWorld(new SoalAEnd());
        }
    }
}
