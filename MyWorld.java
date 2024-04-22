import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int score= 0;
    private Label myScore= new Label("Score: " +score,30 );

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    public void updateScore()
    {
        score++;
        myScore.setValue("Score: "+score);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(myScore, 300,75);
        int[] maze={1,1,0,1,1,0,1,1,1,1,1,1};

        for(int x=0; x<maze.length; x++)
        {
            if (maze[x]==1) {
                addObject(new wall(),25+50*x,125);
            }
        }
        /*wall wall = new wall();
        addObject(wall,25,25);
        addObject(new wall(),25,75);*/
        person person = new person();
        addObject(person,300,300);
        
        
        addObject(new apple(),25,25);
        addObject(new apple(), Greenfoot.getRandomNumber(400)+ 100,Greenfoot.getRandomNumber(400)+100);
    }
}





