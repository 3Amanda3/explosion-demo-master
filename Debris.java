import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Debris here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Debris extends Actor
{
    private int speed = Greenfoot.getRandomNumber(10)+5;
    
    /**
     * Debris is the constructor of the debris class
     * @param no parameters
     * @return nothing is returned
     */
    public Debris()
    {
        int w = Greenfoot.getRandomNumber(20)+1;
        int h = Greenfoot.getRandomNumber(20)+1;
        setRotation(Greenfoot.getRandomNumber(360)); 
        getImage().scale(w,h);

    }

    /**
     * Act - do whatever the Debris wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * @param no parameters
     * @return nothing is returned
     */
    public void act() 
    {       
        move(speed);

        if(isAtEdge())
        {
            BadWorld world = (BadWorld)getWorld();
            getWorld().removeObject(this);  

        }

    }    
}
