// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Cannon here. @author (your name) @version (a version number or a date)
 */
public class Cannon extends Actor
{
    private static final double CANNON_BALL_VELOCITY = 1500.0;

    /**
     * Allows the methods to be used.
     */
    public void act()
    {
        moveAround();
    }

    /**
     * Allows the cannons to move at random intervals, making the game have more replayability.
     */
    public void moveAround()
    {
        if (Greenfoot.getRandomNumber(70) == 1) {
            CannonBall newBall =  new  CannonBall();
            getWorld().addObject(newBall, getX(), getY());
        }
    }

    /**
     * Allows the cannonball to allign with the vectors using trigonometry.
     */
    public void alignWithVector(Vector2D v)
    {
        double adjacent = v.getX();
        double opposite = v.getY();
        double angleRadians = Math.atan2(opposite, adjacent);
        double angleDegrees = Math.toDegrees(angleRadians);
        setRotation((int)angleDegrees);
    }
}
