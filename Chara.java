import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chara here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chara extends Actor
{
    /**
     * Act - do whatever the Chara wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage chara;
    
    public Chara(String gifName){
        chara = new GifImage(gifName);
    }
    
    public void act()
    {
        setImage(chara.getCurrentImage());
    }
}
