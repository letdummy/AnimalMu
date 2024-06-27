import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Referensi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Referensi extends Actor
{
    /**
     * Act - do whatever the Referensi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this)){
            LandingPage.pop();
            if(TipeSoal.type == "A"){
                Greenfoot.setWorld(new ReferensiPageA());
            } else if(TipeSoal.type == "B"){
                Greenfoot.setWorld(new ReferensiPageB());
            }
            
        }
    }
}
