import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The butterfly flies around the world but stops at the edges.
 */
public class Butterfly extends Actor
{
    int speed = 4;
    /**
     * Act - do whatever the Butterfly wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(speed);

        if (Greenfoot.isKeyDown("right") )
        {
            turn(3);
        }

        if (Greenfoot.isKeyDown("left") )
        {
            turn(-3);
        }

        if(Greenfoot.mouseClicked(getWorld())){
            turn(-20);
        }

        if (Greenfoot.isKeyDown("up")) {
            speed = speed + 1;
        }

        if (Greenfoot.isKeyDown("down")) {
            speed = speed - 1;
        }
    }    
}
