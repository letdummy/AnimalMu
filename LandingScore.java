import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LandingScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LandingScore extends World
{
    /**
     * Constructor for objects of class LandingScore.
     * 
     */
    public static Counter counter = new Counter();
    
    public LandingScore()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        int score = LandingScore.counter.getValue();
        
        KunciJawabanBtn kunci = new KunciJawabanBtn();
        addObject(kunci,639,462);

        Score0 score0 = new Score0();
        Score1 score1 = new Score1();
        Score2 score2 = new Score2();
        Score3 score3 = new Score3();
        Score4 score4 = new Score4();
        Score5 score5 = new Score5();
        Score6 score6 = new Score6();
        Score7 score7 = new Score7();
        Score8 score8 = new Score8();
        Score9 score9 = new Score9();
        Score10 score10 = new Score10();

        if(score == 0){
            addObject(score0,405,330);
        } else if(score == 1){
            addObject(score1,405,330);
        } else if(score == 2){
            addObject(score2,405,330);
        } else if(score == 3){
            addObject(score3,405,330);
        } else if(score == 4){
            addObject(score4,405,330);
        } else if(score == 5){
            addObject(score5,405,330);
        } else if(score == 6){
            addObject(score6,405,330);
        } else if(score == 7){
            addObject(score7,405,330);
        } else if(score == 8){
            addObject(score8,405,330);
        } else if(score == 9){
            addObject(score9,405,330);
        } else{
            addObject(score10,405,330);
        }
        
        Unmute unmute = new Unmute();
        addObject(unmute,766,32);
    }
}
