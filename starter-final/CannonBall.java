import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class CannonBall here. @author (your name) @version (a version number or a date)
 */
public class CannonBall extends Actor
{
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    private Point2D position;
    private Vector2D velocity;
    private Vector2D acceleration;



    /**
     * Allows all methods to work, and checks to see if the "isGameLost" boolean is set to true.
     */
    public void act()
    {
        moveAround();
        if (position == null)
        {
            position = new Point2D(getX(), getY());
        }
        if (isGameLost()) {
            transitionToGameOverWorld();
        }
    
        MyWorld world  = (MyWorld) getWorld();
        
        
        setLocation((int) position.getX(), (int) position.getY());
        
    
    
    }

    
    
    /**
     * Allows the cannonballs to move, and also removes the ladybug from the world. 
     */
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(720) == 1) {
            turn(0);
        }
        
        Actor ladybug = getOneIntersectingObject(Ladybug.class);
        if (ladybug != null) {
            World world = getWorld();
            world.removeObject(ladybug);
            Greenfoot.playSound("lose.wav");
        }
    }

    /**
     * Checks to see if the ladybug has been removed.
     */
    public boolean isGameLost()
    {
        World world = getWorld();
        if (world.getObjects(Ladybug.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Transitions the player to the Game Over screen.
     */
    public void transitionToGameOverWorld()
    {
        World gameOverWorld =  new  GameOverWorld();
        Greenfoot.setWorld(gameOverWorld);
    }
}
