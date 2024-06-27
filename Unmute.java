import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Unmute here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Unmute extends SoundControl
{
    /**
     * Act - do whatever the Unmute wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    
    
    public void act()
    {
        // Add your action code here.
        
        // check audio status
        if(LandingPage.audio == "unmute"){
                this.setImage("unmute.png");
                LandingPage.startBgm();
            } else {
                this.setImage("mute.png");
                LandingPage.stopBgm();
            }
        
        if(Greenfoot.mousePressed(this)){
            if(LandingPage.audio == "unmute"){
                LandingPage.audio = "mute";
                this.setImage("mute.png");
                LandingPage.stopBgm();
            } else {
                LandingPage.audio = "unmute";
                LandingPage.pop();
                this.setImage("unmute.png");
                LandingPage.startBgm();
            }
        }
    }
}
