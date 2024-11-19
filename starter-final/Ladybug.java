// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ladybug extends Actor
{

    /**
     * Act - do whatever the Hero wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        eatTarget();
        if (isGameWon()) {
            transitionToGameWonWorld();
        }
    }

    /**
     * This method allows the Ladybug to move and change direction.
     */
    public void moveAndTurn()
    {
        move(4);
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
    }

    /**
     * The ladybug removes the target from the world for the game to know that he has reached the Finish Location.
     */
    public void eatTarget()
    {
        Actor target = getOneIntersectingObject(FinishLocation.class);
        if (target != null) {
            World world = getWorld();
            world.removeObject(target);
            Greenfoot.playSound("win.wav");
        }
    }

    /**
     * This boolean checks to see if all the targets have been removed.
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(FinishLocation.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Transitions the player to the Game Won screen.
     */
    public void transitionToGameWonWorld()
    {
        World gameWonWorld =  new  GameWonWorld();
        Greenfoot.setWorld(gameWonWorld);
    }
}
