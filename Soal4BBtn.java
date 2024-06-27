import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Soal4BBtn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Soal4BBtn extends Actor
{
    /**
     * Act - do whatever the Soal4BBtn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    protected void clicked(){
        if(Greenfoot.mousePressed(this)){
            LandingPage.pop();
            Greenfoot.setWorld(new SoalB5());
        }
    }
    protected void clickedAdd(){
        if(Greenfoot.mousePressed(this)){
            LandingScore.counter.add(1);
            LandingPage.pop();
            Greenfoot.setWorld(new SoalB5());
        }
    }
}
