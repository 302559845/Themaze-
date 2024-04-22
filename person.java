import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class person extends Actor
{
    /**
     * Act - do whatever the person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         moveAround();
         eatApple();
    }
    public void eatApple()
    {
        if(isTouching(apple.class))
        {
            removeTouching(apple.class);
            MyWorld world= getWorldOfType(MyWorld.class);
            world.updateScore();
        }
    }
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-1);
            if(isTouching(wall.class))
            {
                setLocation(getX(), getY()+2);
            }
        }
                if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+1);
            if(isTouching(wall.class))
            {
                setLocation(getX(), getY()-2);
            }
        }
                if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-1,getY());
            if(isTouching(wall.class))
            {
                setLocation(getX()+2, getY());
            }
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+1,getY());
            if(isTouching(wall.class))
            {
                setLocation(getX()-2, getY());
            }
        }
        
    }
}
