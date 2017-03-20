import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Actor
{
    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        explode();
    }

    /**
     * explode will
     * @param there are no parameters
     * @return Nothing is retunred
     */
    public void explode()
    {
        Greenfoot.playSound("MetalExplosion.wav");

        for(int i = 0; i < 49 + 1; i++)
        {
            getWorld().addObject( new Debris(), getX(), getY());                                         
        }
        getWorld().addObject( new Explosion(), getX(), getY());

        getWorld().removeObject(this);

    }
}

