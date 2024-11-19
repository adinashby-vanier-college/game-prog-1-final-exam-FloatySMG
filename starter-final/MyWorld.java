import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(800, 600, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        CannonBall cannonBall =  new  CannonBall();
        addObject(cannonBall, 262, 101);
        CannonBall cannonBall2 =  new  CannonBall();
        addObject(cannonBall2, 361, 103);
        CannonBall cannonBall3 =  new  CannonBall();
        addObject(cannonBall3, 487, 134);
        cannonBall3.setLocation(494, 136);
        CannonBall cannonBall4 =  new  CannonBall();
        addObject(cannonBall4, 496, 195);
        CannonBall cannonBall5 =  new  CannonBall();
        addObject(cannonBall5, 448, 296);
        CannonBall cannonBall6 =  new  CannonBall();
        addObject(cannonBall6, 616, 170);
        CannonBall cannonBall7 =  new  CannonBall();
        addObject(cannonBall7, 603, 480);
        CannonBall cannonBall8 =  new  CannonBall();
        addObject(cannonBall8, 423, 479);
        CannonBall cannonBall9 =  new  CannonBall();
        addObject(cannonBall9, 191, 473);
        FinishLocation finishLocation =  new  FinishLocation();
        addObject(finishLocation, 75, 324);
        Ladybug hero =  new  Ladybug();
        addObject(hero, 720, 286);
        hero.setLocation(731, 298);
        hero.setLocation(709, 282);
        removeObject(hero);
        addObject(hero, 711, 302);
        hero.setLocation(722, 39);
        cannonBall5.setLocation(415, 318);
        hero.setRotation(180);
        hero.setLocation(742, 58);
        hero.setLocation(734, 54);
        cannonBall4.setLocation(496, 211);
        cannonBall5.setLocation(404, 303);
        CannonBall cannonBall10 =  new  CannonBall();
        addObject(cannonBall10, 643, 315);
        cannonBall10.setLocation(627, 314);
        cannonBall5.setLocation(391, 316);
        cannonBall10.setLocation(628, 318);
        cannonBall6.setLocation(616, 177);
        cannonBall.setLocation(220, 103);
        cannonBall2.setLocation(338, 94);
        Cannon cannon =  new  Cannon();
        addObject(cannon, 494, 61);
        cannon.setRotation(90);
        Cannon cannon2 =  new  Cannon();
        addObject(cannon2, 257, 312);
        Cannon cannon3 =  new  Cannon();
        addObject(cannon3, 721, 477);
        cannon3.setRotation(180);
        Cannon cannon4 =  new  Cannon();
        addObject(cannon4, 80, 132);
        Cannon cannon5 =  new  Cannon();
        addObject(cannon5, 719, 181);
        cannon5.getImage();
        cannon5.getRotation();
        cannon5.getRotation();
        cannon5.setRotation(180);
        removeObject(cannonBall);
        removeObject(cannonBall2);
        removeObject(cannonBall9);
        removeObject(cannonBall8);
        removeObject(cannonBall7);
        removeObject(cannonBall10);
        removeObject(cannonBall6);
        removeObject(cannonBall3);
        removeObject(cannonBall4);
        removeObject(cannonBall5);
        FinishLocation finishLocation2 =  new  FinishLocation();
        addObject(finishLocation2, 647, 56);
        removeObject(cannon);
        addObject(cannon, 519, 62);
        cannon.setRotation(90);
        removeObject(finishLocation2);
    }
}
