import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KunciJawabanBtn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KunciJawabanBtn extends Actor
{
    /**
     * Act - do whatever the KunciJawabanBtn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this)){
            LandingPage.pop();
            if(TipeSoal.type == "A"){
                Greenfoot.setWorld(new KunciJawabanA());
            } else if(TipeSoal.type == "B"){
                Greenfoot.setWorld(new KunciJawabanB());
            }
            
        }
    }
}
